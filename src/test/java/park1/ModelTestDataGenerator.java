package park1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @author  created by boming
 * @date    2018年3月2日 下午3:26:29
 */
public class ModelTestDataGenerator {

	private static String basePath = ModelGeneratorUtil.class.getResource("/").getPath();
	private static String basePath1 = basePath.substring(0, basePath.indexOf("parkflow") + 6);
	
	private static final String testDataDir = basePath1 + "/src/test/java/testData/";
	
//	public static void main(String[] args) {
//		generateDataByTable("vw_ticket_refund");
//	}
	public static void generateAllData() {
		
		List<ColumnInfo> columnInfoList = ModelGeneratorUtil.getAllColumnInfo();
		for(int i=0;i<columnInfoList.size();i++) {
			File f = new File(testDataDir + columnInfoList.get(i).getTable()+".data");
			try {
				if(!f.exists())
					f.createNewFile();
				StringBuilder tabSb = new StringBuilder();
				tabSb.append(columnInfoList.get(i).getTable()).append("\n").append("{").append("\n");
				for(int j=0;j<columnInfoList.get(i).getColumns().size();j++) {
					if(columnInfoList.get(i).getPropTypes().get(j).equals("String")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":\"a\",").append("\n");
					}else if(columnInfoList.get(i).getPropTypes().get(j).equals("Integer")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":1,").append("\n");
					}else if(columnInfoList.get(i).getPropTypes().get(j).equals("Long")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":3,").append("\n");
					}else if(columnInfoList.get(i).getPropTypes().get(j).equals("BigDecimal")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":1.2,").append("\n");
					}
				}
				String content = tabSb.subSequence(0, tabSb.length()-2).toString() + "\n" + "}";
				FileUtils.write(f, content);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public static void generateDataByTable(String table) {
		List<ColumnInfo> columnInfoList = ModelGeneratorUtil.getColumnInfoByTable(table);
		for(int i=0;i<columnInfoList.size();i++) {
			System.out.println(testDataDir + columnInfoList.get(i).getTable()+".data");
			File f = new  File(testDataDir + columnInfoList.get(i).getTable()+".data");
			try {
				if(!f.exists())
					f.createNewFile();
				StringBuilder tabSb = new StringBuilder();
				tabSb.append(columnInfoList.get(i).getTable()).append("\n").append("{").append("\n");
				for(int j=0;j<columnInfoList.get(i).getColumns().size();j++) {
					if(columnInfoList.get(i).getPropTypes().get(j).equals("String")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":\"a\",").append("\n");
					}else if(columnInfoList.get(i).getPropTypes().get(j).equals("Integer")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":1,").append("\n");
					}else if(columnInfoList.get(i).getPropTypes().get(j).equals("Long")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":3,").append("\n");
					}else if(columnInfoList.get(i).getPropTypes().get(j).equals("BigDecimal")) {
						tabSb.append("	\"" + columnInfoList.get(i).getColumns().get(j) + "\":1.2,").append("\n");
					}
				}
				String content = tabSb.subSequence(0, tabSb.length()-2).toString() + "\n" + "}";
				FileUtils.write(f, content);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
