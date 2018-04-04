package park1;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * 
 * @author  created by boming
 * @date    2018年3月1日 上午10:09:28
 */
public class ModelViewGeneratorUtil {

	private static final String schema = "parkflow";
	private static final String getViewsSql = "select LOWER(TABLE_NAME) as `table`,'' as tableComment from information_schema.VIEWS where TABLE_SCHEMA=?";
	private static final String getViewSql = "select LOWER(TABLE_NAME) as `table`,'' as tableComment from information_schema.VIEWS where TABLE_SCHEMA=? and LOWER(TABLE_NAME)=?";
	private static final String getColumnsAndColumnCommentsSql = "select COLUMN_NAME as `column`,COLUMN_COMMENT as columnComment,DATA_TYPE as dataType, COLUMN_KEY as columnKey from information_schema.`COLUMNS` where TABLE_SCHEMA=? and LOWER(TABLE_NAME)=?";
	
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://192.168.1.24:3306/parkflow";
	private static String user = "root";
	private static String password = "yw@123$%^";
	private static String basePath = ModelGeneratorUtil.class.getResource("/").getPath();
	private static String basePath1 = basePath.substring(0, basePath.indexOf("parkflow") + 6);
	
	private static String modelDir = basePath1 + "src/main/java/cn/chinaflame/park/model/";//实体类文件目录
	private static String providerDir = basePath1 + "src/main/java/cn/chinaflame/park/dao/";//实体类文件目录
	private static String modelPackage = "cn.chinaflame.park.model";//实体类包名
	private static String providerPackage = "cn.chinaflame.park.dao";//provider包名
//	private static String dataPackage = "cn.chinaflame.park.dao1";//data包名
	private static String templateDir = basePath1 + "src/test/java/template/";
	
//	public static void main(String[] args) {
//		generateTable("vw_ticket_refund");
//	}
	
	public static void generateAllTable() {
		List<ColumnInfo> columnInfoList = getAllColumnInfo();
		process(columnInfoList);
	}
	public static void generateTable(String table) {
		List<ColumnInfo> columnInfoList = getColumnInfoByTable(table);
		process(columnInfoList);
	}
	public static List<ColumnInfo> getAllColumnInfo() {
		return getColumnInfo(0, null);
	}
	public static List<ColumnInfo> getColumnInfoByTable(String table) {
		return getColumnInfo(1, table);
	}
	
	public static void process(List<ColumnInfo> columnInfoList){
		for(int i=0;i<columnInfoList.size();i++) {
			columnInfoList.get(i).setColumnsStr(Joiner.on(",").join(columnInfoList.get(i).getColumns()));
			columnInfoList.get(i).setPropertyErsStr(Joiner.on(",").join(columnInfoList.get(i).getPropertyErs()));
			columnInfoList.get(i).setPropImportsStr(Joiner.on("\n").join(columnInfoList.get(i).getPropImports()));
			StringBuilder whereSb = new StringBuilder();
			StringBuilder fieldSb = new StringBuilder();
			StringBuilder methodSb = new StringBuilder();
			for(int j=0;j<columnInfoList.get(i).getColumns().size();j++) {
				if(columnInfoList.get(i).getPropTypes().get(j).equals("String")) {
					String method = getPropertyByUpper(columnInfoList.get(i).getProperties().get(j));
					whereSb.append("			if(!Strings.isNullOrEmpty(entity.get"+method
							+"())) {").append("sql.WHERE(\""+columnInfoList.get(i).getProperties().get(j)
					+" = "+columnInfoList.get(i).getPropertyErs().get(j)+"\");}").append("\n");
				}else {
					String method = getPropertyByUpper(columnInfoList.get(i).getProperties().get(j));
					whereSb.append("			if(!Objects.isNull(entity.get"+method
							+"())) {").append("sql.WHERE(\""+columnInfoList.get(i).getProperties().get(j)
					+" = "+columnInfoList.get(i).getPropertyErs().get(j)+"\");}").append("\n");
				}
				fieldSb.append("	private " + columnInfoList.get(i).getPropTypes().get(j) + " " + 
						columnInfoList.get(i).getProperties().get(j) + ";").append("\n");
				methodSb.append("public "+columnInfoList.get(i).getPropTypes().get(j)+" "+getGetMethod(columnInfoList.get(i).getProperties().get(j))+" {return "+
						columnInfoList.get(i).getProperties().get(j)+";}").append("\n").append(
								"public void "+getSetMethod(columnInfoList.get(i).getProperties().get(j), columnInfoList.get(i).getPropTypes().get(j))+" {this."
										+ columnInfoList.get(i).getProperties().get(j)+ " = "+columnInfoList.get(i).getProperties().get(j)+";}").append("\n");
			}
			columnInfoList.get(i).setPropWhereStr(whereSb.toString());
			columnInfoList.get(i).setPropFieldDefStr(fieldSb.toString());
			columnInfoList.get(i).setPropMethodDefStr(methodSb.toString());
		}
		for(int i=0;i<columnInfoList.size();i++) {
			File providerTemplate = new File(templateDir + "provider_view.template");
			File provider = new File(providerDir + columnInfoList.get(i).getTableClasse() + "Provider.java");
			File modelTemplate = new File(templateDir + "model.template");
			File model = new File(modelDir + columnInfoList.get(i).getTableClasse() + ".java");
			File dataTemplate = new File(templateDir + "data_view.template");
			File data = new File(providerDir + columnInfoList.get(i).getTableClasse() + "Data.java");
			try {
				FileUtils.copyFile(providerTemplate, provider);
				System.out.println(columnInfoList.get(i).getPrimaryKey());
				String providerContent = FileUtils.readFileToString(provider).replaceAll("\\$\\{providerPackage\\}", providerPackage)
					.replaceAll("\\$\\{modelPackage\\}", modelPackage).replaceAll("\\$\\{tableClass\\}", columnInfoList.get(i).getTableClasse())
					.replaceAll("\\$\\{table\\}", columnInfoList.get(i).getTable())
					.replaceAll("\\$\\{columnsStr\\}", columnInfoList.get(i).getColumnsStr()).replaceAll("\\$\\{propertyErsStr\\}", columnInfoList.get(i).getPropertyErsStr())
					.replaceAll("\\$\\{propWhereStr\\}", columnInfoList.get(i).getPropWhereStr()).replaceAll("\\$\\{propSetStr\\}", columnInfoList.get(i).getPropSetStr())
					.replaceAll("\\$\\{propWhereSetStr\\}", columnInfoList.get(i).getPropWhereSetStr()).replaceAll("\\$\\{primaryKey\\}", columnInfoList.get(i).getPrimaryKey());
				FileUtils.write(provider, providerContent);
				
				FileUtils.copyFile(modelTemplate, model);
				String modelContent = FileUtils.readFileToString(model).replaceAll("\\$\\{modelPackage\\}", modelPackage)
					.replaceAll("\\$\\{propImportsStr\\}", columnInfoList.get(i).getPropImportsStr()).replaceAll("\\$\\{tableComment\\}", columnInfoList.get(i).getTableComment())
					.replaceAll("\\$\\{propFieldDefStr\\}", columnInfoList.get(i).getPropFieldDefStr()).replaceAll("\\$\\{propMethodDefStr\\}", columnInfoList.get(i).getPropMethodDefStr())
					.replaceAll("\\$\\{tableClass\\}", columnInfoList.get(i).getTableClasse());
				FileUtils.write(model, modelContent);
				
				FileUtils.copyFile(dataTemplate, data);
				String dataContent = FileUtils.readFileToString(data).replaceAll("\\$\\{dataPackage\\}", providerPackage)
					.replaceAll("\\$\\{modelPackage\\}", modelPackage).replaceAll("\\$\\{tableClass\\}", columnInfoList.get(i).getTableClasse());
//					.replaceAll("\\$\\{tableComment\\}", columnInfoList.get(i).getTableComment()).replaceAll("\\$\\{table\\}", columnInfoList.get(i).getTable())
//					.replaceAll("\\$\\{columnsStr\\}", columnInfoList.get(i).getColumnsStr()).replaceAll("\\$\\{propertyErsStr\\}", columnInfoList.get(i).getPropertyErsStr())
//					.replaceAll("\\$\\{propWhereStr\\}", columnInfoList.get(i).getPropWhereStr()).replaceAll("\\$\\{propSetStr\\}", columnInfoList.get(i).getPropSetStr())
//					.replaceAll("\\$\\{propWhereSetStr\\}", columnInfoList.get(i).getPropWhereSetStr());
				FileUtils.write(data, dataContent);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static List<ColumnInfo> getColumnInfo(int flg, String table) {
		List<ColumnInfo> columnInfoList = Lists.newArrayList();
		TableInfo tableInfo = new TableInfo();
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement tablePst = null;
			if(flg==0) {
				tablePst = conn.prepareStatement(getViewsSql);
				tablePst.setString(1, schema);
			}else {
				tablePst = conn.prepareStatement(getViewSql);
				tablePst.setString(1, schema);
				tablePst.setString(2, table);
			}
			ResultSet tableRs = tablePst.executeQuery();
			while(tableRs.next()) {
				tableInfo.getTables().add(tableRs.getString(1));
				tableInfo.getTablesComments().add(tableRs.getString(2));
				String key = tableRs.getString(1);
				key = getClass(key);
				tableInfo.getTableClasses().add(key);
			}
			tablePst.close();
			tableRs.close();
			for(int i=0;i<tableInfo.getTables().size();i++) {
				ColumnInfo columnInfo = new ColumnInfo();
				columnInfo.setTable(tableInfo.getTables().get(i));
				columnInfo.setTableComment(tableInfo.getTablesComments().get(i));
				columnInfo.setTableClasse(tableInfo.getTableClasses().get(i));
				PreparedStatement columnPst = conn.prepareStatement(getColumnsAndColumnCommentsSql);
				columnPst.setString(1, schema);
				columnPst.setString(2, tableInfo.getTables().get(i));
				ResultSet columnRs = columnPst.executeQuery();
				while(columnRs.next()) {
					if("PRI".equals(columnRs.getString(4)))
						columnInfo.setPrimaryKey(columnRs.getString(1));
					columnInfo.getColumns().add(columnRs.getString(1));
					columnInfo.getColumnComments().add(columnRs.getString(2));
					columnInfo.getColumnsType().add(columnRs.getString(3));		
					columnInfo.getPropTypes().add(getJavaType(columnRs.getString(3), 1));
					columnInfo.getPropImports().add("import " + getJavaType(columnRs.getString(3), 0) + ";");
					String property = getProperty(columnRs.getString(1));
					columnInfo.getProperties().add(property);
					columnInfo.getPropertyErs().add("#{"+property+"}");
				}
				HashSet<String> set = new HashSet<>(columnInfo.getPropImports());
				columnInfo.getPropImports().clear();
				columnInfo.getPropImports().addAll(set);
				columnInfoList.add(columnInfo);
				columnPst.close();
				columnRs.close();
			}
			return columnInfoList;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	private static String getClass(String table) {
		table = table.substring(0, 1).toUpperCase() + table.substring(1);
		while(table.contains("_")) {
			int a = table.indexOf("_");
			table = table.substring(0, a+1) + table.substring(a+1, a+2).toUpperCase() + table.substring(a+2, table.length());
			table = table.replaceFirst("_", "");
		}
		return table;
	}
	private static String getPropertyByUpper(String property) {
		property = property.substring(0, 1).toUpperCase() + property.substring(1);
		return property;
	}
	private static String getProperty(String column) {
//		while(column.contains("_")) {
//			int a = column.indexOf("_");
//			column = column.substring(0, a+1) + column.substring(a+1, a+2).toUpperCase() + column.substring(a+2, column.length());
//			column = column.replaceFirst("_", "");
//		}
		return column;
	}
	private static String getGetMethod(String property) {
		property = property.substring(0, 1).toUpperCase() + property.substring(1);
		return "get"+property+"()";
	}
	private static String getSetMethod(String property, String javaType) {
		String method = property.substring(0, 1).toUpperCase() + property.substring(1);
		return "set"+method+"("+javaType+" "+property+")";
	}
	private static String getJavaType(String columnType, int flg) {
		if(columnType.contains("varchar") || columnType.contains("text") || columnType.contains("char")
				|| columnType.contains("date")) {
			if(flg==0) return "java.lang.String"; else return "String";
		}
		if(columnType.contains("decimal")) {
			if(flg==0) return "java.math.BigDecimal"; else return "BigDecimal";
		}
		if(columnType.contains("int")) {
			if(flg==0) return "java.lang.Long"; else return "Long";
		}
		return null;
	}
//	private String getJavaMybatisType(String column) {
//		String property = getProperty(column);
//		return "#{"+property+"}";
//	}
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,password);
		if(!con.isClosed())
			System.out.println("Succeeded connecting to the Database!");
		return con;
	}
}
