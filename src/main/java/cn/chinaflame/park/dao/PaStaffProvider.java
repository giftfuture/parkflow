package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaStaff;

/**
 * 员工信息表 
 * provider
 */
public class PaStaffProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaStaff(PaStaff entity) {
		SQL sql = new SQL().INSERT_INTO("pa_staff");
		sql.VALUES("staffname,staffno,loginname,staffdept,email,jobtitle,phone,gender,state,cardno,pwd,createby,createtime,updateby,updatetime,stafflevel,lastlogintime,logincount,role,ip", "#{staffname},#{staffno},#{staffno},#{staffdept},#{email},#{jobtitle},#{phone},#{gender},#{state},#{cardno},#{pwd},#{createby},now(),#{updateby},now(),#{stafflevel},#{lastlogintime},#{logincount},#{role},#{ip}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaStaffByCount(PaStaff entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_staff");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname = #{staffname}");}
			if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.WHERE("staffno = #{staffno}");}
			if(!Strings.isNullOrEmpty(entity.getLoginname())) {sql.WHERE("loginname = #{loginname}");}
			if(!Objects.isNull(entity.getStaffdept())) {sql.WHERE("staffdept = #{staffdept}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.WHERE("jobtitle = #{jobtitle}");}
			if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.WHERE("phone = #{phone}");}
			if(!Objects.isNull(entity.getGender())) {sql.WHERE("gender = #{gender}");}
			//if(!Objects.isNull(entity.getState())) {sql.WHERE("state = #{state}");}
			sql.WHERE("state = 1");
			if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.WHERE("cardno = #{cardno}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getStafflevel())) {sql.WHERE("stafflevel = #{stafflevel}");}
			if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.WHERE("lastlogintime = #{lastlogintime}");}
			if(!Objects.isNull(entity.getLogincount())) {sql.WHERE("logincount = #{logincount}");}
			if(!Objects.isNull(entity.getRole())) {sql.WHERE("role = #{role}");}
			if(!Objects.isNull(entity.getIp())) {sql.WHERE("ip = #{ip}");}
		return sql.toString();
	}
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public String selectPaStaffByLimt(PaStaff entity) {
		SQL sql = new SQL().SELECT("pa_staff.id,pa_staff.id staffid,staffname,staffno,loginname,staffdept,email,jobtitle,phone,gender,case pa_staff.state when 1 then '在职' when 2 then '离职' else '' end staffstate,cardno,pwd,pa_staff.createby,pa_staff.ip,pa_staff.createtime,pa_staff.updateby,pa_staff.updatetime,stafflevel,lastlogintime,logincount,role,pa_sys_department.name deptname,pa_sys_role.rolename ").FROM("pa_staff")
				.LEFT_OUTER_JOIN("pa_sys_department on pa_sys_department.id=pa_staff.staffdept")
				.LEFT_OUTER_JOIN("pa_sys_role on pa_sys_role.id=pa_staff.role ");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("pa_staff.id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname = #{staffname}");}
			if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.WHERE("staffno = #{staffno}");}
			if(!Strings.isNullOrEmpty(entity.getLoginname())) {sql.WHERE("loginname = #{loginname}");}
			if(!Objects.isNull(entity.getStaffdept())) {sql.WHERE("staffdept = #{staffdept}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.WHERE("jobtitle = #{jobtitle}");}
			if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.WHERE("phone = #{phone}");}
			if(!Objects.isNull(entity.getGender())) {sql.WHERE("gender = #{gender}");}
			sql.WHERE("pa_staff.state = 1");
			if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.WHERE("cardno = #{cardno}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_staff.createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_staff.createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_staff.updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_staff.updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getStafflevel())) {sql.WHERE("stafflevel = #{stafflevel}");}
			if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.WHERE("lastlogintime = #{lastlogintime}");}
			if(!Objects.isNull(entity.getLogincount())) {sql.WHERE("logincount = #{logincount}");}
			if(!Objects.isNull(entity.getRole())) {sql.WHERE("role = #{role}");}
			if(!Objects.isNull(entity.getIp())) {sql.WHERE("ip = #{ip}");}
		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String searchPaStaffByCount(PaStaff entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_staff");
				if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname like concat(concat('%', #{staffname}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.WHERE("staffno like concat(concat('%', #{staffno}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getLoginname())) {sql.WHERE("loginname  like concat(concat('%', #{loginname}),'%')");}
				if(!Objects.isNull(entity.getStaffdept())) {sql.WHERE("staffdept = #{staffdept}");}
				if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email  like concat(concat('%', #{email}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.WHERE("jobtitle like concat(concat('%', #{jobtitle}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.WHERE("phone = #{phone}");}
				if(!Objects.isNull(entity.getGender())) {sql.WHERE("gender = #{gender}");}
				sql.WHERE("pa_staff.state =1");
				if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.WHERE("cardno  like concat(concat('%', #{cardno}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
				if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_staff.createby = #{createby}");}
				if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_staff.createtime = #{createtime}");}
				if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_staff.updateby = #{updateby}");}
				if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_staff.updatetime = #{updatetime}");}
				if(!Objects.isNull(entity.getStafflevel())) {sql.WHERE("stafflevel = #{stafflevel}");}
				if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.WHERE("lastlogintime = #{lastlogintime}");}
				if(!Objects.isNull(entity.getLogincount())) {sql.WHERE("logincount = #{logincount}");}
				if(!Objects.isNull(entity.getRole())) {sql.WHERE("role = #{role}");}
				if(!Objects.isNull(entity.getIp())) {sql.WHERE("ip = #{ip}");}
		return sql.toString();
	}
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public String searchPaStaffByLimt(PaStaff entity) {
		SQL sql = new SQL().SELECT("pa_staff.id,pa_staff.id staffid,staffname,staffno,loginname,staffdept,email,jobtitle,phone,case gender when 1 then '男' when 2 then '女' else '' end gender,case pa_staff.state when 1 then '在职' when 2 then '离职' else '' end staffstate,cardno,pwd,pa_staff.createby,pa_staff.createtime,pa_staff.updateby,pa_staff.updatetime,stafflevel,lastlogintime,logincount,role,pa_sys_department.name deptname,pa_sys_role.rolename").FROM("pa_staff")
				.LEFT_OUTER_JOIN("pa_sys_department on pa_sys_department.id=pa_staff.staffdept")
				.LEFT_OUTER_JOIN("pa_sys_role on pa_sys_role.id=pa_staff.role ");
				if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname like concat(concat('%', #{staffname}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.WHERE("staffno like concat(concat('%', #{staffno}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getLoginname())) {sql.WHERE("loginname  like concat(concat('%', #{loginname}),'%')");}
				if(!Objects.isNull(entity.getStaffdept())) {sql.WHERE("staffdept = #{staffdept}");}
				if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email  like concat(concat('%', #{email}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.WHERE("jobtitle like concat(concat('%', #{jobtitle}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.WHERE("phone = #{phone}");}
				if(!Objects.isNull(entity.getGender())) {sql.WHERE("gender = #{gender}");}
				sql.WHERE("pa_staff.state = 1");
				if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.WHERE("cardno  like concat(concat('%', #{cardno}),'%')");}
				if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
				if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_staff.createby = #{createby}");}
				if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_staff.createtime = #{createtime}");}
				if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_staff.updateby = #{updateby}");}
				if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_staff.updatetime = #{updatetime}");}
				if(!Objects.isNull(entity.getStafflevel())) {sql.WHERE("stafflevel = #{stafflevel}");}
				if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.WHERE("lastlogintime = #{lastlogintime}");}
				if(!Objects.isNull(entity.getLogincount())) {sql.WHERE("logincount = #{logincount}");}
				if(!Objects.isNull(entity.getRole())) {sql.WHERE("role = #{role}");}
				if(!Objects.isNull(entity.getIp())) {sql.WHERE("ip = #{ip}");}
		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaStaff(PaStaff entity) {
		SQL sql = new SQL().SELECT("pa_staff.id,pa_staff.id staffid,staffname,staffno,loginname,staffdept,email,jobtitle,phone,case gender when 1 then '男' when 2 then '女' else '' end gender,case pa_staff.state when 1 then '在职' when 2 then '离职' else '' end staffstate,cardno,pwd,"
				+ "pa_staff.ip,pa_staff.createby,pa_staff.createtime,pa_staff.updateby,pa_staff.updatetime,stafflevel,lastlogintime,logincount,role,pa_sys_department.name deptname,pa_sys_role.rolename").FROM("pa_staff")
			.LEFT_OUTER_JOIN("pa_sys_department on pa_sys_department.id=pa_staff.staffdept")
			.LEFT_OUTER_JOIN("pa_sys_role on pa_sys_role.id=pa_staff.role ");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("pa_staff.id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname = #{staffname}");}
			if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.WHERE("staffno = #{staffno}");}
			if(!Strings.isNullOrEmpty(entity.getLoginname())) {sql.WHERE("loginname = #{loginname}");}
			if(!Objects.isNull(entity.getStaffdept())) {sql.WHERE("staffdept = #{staffdept}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.WHERE("jobtitle = #{jobtitle}");}
			if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.WHERE("phone = #{phone}");}
			if(!Objects.isNull(entity.getGender())) {sql.WHERE("gender = #{gender}");}
			sql.WHERE("pa_staff.state =1");
			if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.WHERE("cardno = #{cardno}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_staff.createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_staff.createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_staff.updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_staff.updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getStafflevel())) {sql.WHERE("stafflevel = #{stafflevel}");}
			if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.WHERE("lastlogintime = #{lastlogintime}");}
			if(!Objects.isNull(entity.getLogincount())) {sql.WHERE("logincount = #{logincount}");}
			if(!Objects.isNull(entity.getRole())) {sql.WHERE("role = #{role}");}
		return sql.toString();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String searchPaStaff(PaStaff entity) {
		SQL sql = new SQL().SELECT("pa_staff.id,pa_staff.id staffid,staffname,staffno,loginname,staffdept,email,jobtitle,phone,case gender when 1 then '男' when 2 then '女' else '' end gender,"
				+ "case pa_staff.state when 1 then '在职' when 2 then '离职' else '' end staffstate,cardno,pwd,pa_staff.createby,pa_staff.createtime,pa_staff.updateby,pa_staff.ip,"
				+ "pa_staff.updatetime,stafflevel,lastlogintime,logincount,role,pa_sys_department.name deptname").FROM("pa_staff")
			.LEFT_OUTER_JOIN("pa_sys_department on pa_sys_department.id=pa_staff.staffdept");
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname like concat(concat('%', #{staffname}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.WHERE("staffno like concat(concat('%', #{staffno}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getLoginname())) {sql.WHERE("loginname  like concat(concat('%', #{loginname}),'%')");}
			if(!Objects.isNull(entity.getStaffdept())) {sql.WHERE("staffdept = #{staffdept}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email  like concat(concat('%', #{email}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.WHERE("jobtitle like concat(concat('%', #{jobtitle}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.WHERE("phone = #{phone}");}
			if(!Objects.isNull(entity.getGender())) {sql.WHERE("gender = #{gender}");}
			sql.WHERE("pa_staff.state = 1");
			if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.WHERE("cardno  like concat(concat('%', #{cardno}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_staff.createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_staff.createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_staff.updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_staff.updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getStafflevel())) {sql.WHERE("stafflevel = #{stafflevel}");}
			if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.WHERE("lastlogintime = #{lastlogintime}");}
			if(!Objects.isNull(entity.getLogincount())) {sql.WHERE("logincount = #{logincount}");}
			if(!Objects.isNull(entity.getRole())) {sql.WHERE("role = #{role}");}
		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("id,staffname,staffno,loginname,staffdept,email,jobtitle,phone,gender,state,cardno,pwd,createby,createtime,updateby,updatetime,stafflevel,lastlogintime,logincount,role,ip").FROM("pa_staff");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaStaff(PaStaff entity) {
		SQL sql = new SQL().UPDATE("pa_staff");
				sql.SET("staffname = #{staffname}");
		sql.SET("staffno = #{staffno}");
		sql.SET("loginname = #{staffno}");
		sql.SET("staffdept = #{staffdept}");
		sql.SET("email = #{email}");
		sql.SET("jobtitle = #{jobtitle}");
		sql.SET("phone = #{phone}");
		sql.SET("gender = #{gender}");
		sql.SET("state = #{state}");
		sql.SET("cardno = #{cardno}");
		//sql.SET("pwd = #{pwd}");
		sql.SET("createby = #{createby}");
		sql.SET("updateby = #{updateby}");
		sql.SET("stafflevel = #{stafflevel}");
		sql.SET("lastlogintime = #{lastlogintime}");
		sql.SET("logincount = #{logincount}");
		sql.SET("role = #{role}");
		sql.SET("updatetime = now()");
		sql.SET("ip=#{ip}");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaStaffByNullChk(PaStaff entity) {
		SQL sql = new SQL().UPDATE("pa_staff");
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.SET("staffname = #{staffname}");}
			if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.SET("staffno = #{staffno}");}
			if(!Strings.isNullOrEmpty(entity.getStaffno())) {sql.SET("loginname = #{staffno}");}
			if(!Objects.isNull(entity.getStaffdept())) {sql.SET("staffdept = #{staffdept}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.SET("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getJobtitle())) {sql.SET("jobtitle = #{jobtitle}");}
			if(!Strings.isNullOrEmpty(entity.getPhone())) {sql.SET("phone = #{phone}");}
			if(!Objects.isNull(entity.getGender())) {sql.SET("gender = #{gender}");}
			if(!Objects.isNull(entity.getState())) {sql.SET("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getCardno())) {sql.SET("cardno = #{cardno}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.SET("pwd = #{pwd}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.SET("createby = #{createby}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.SET("updateby = #{updateby}");}
			if(!Objects.isNull(entity.getStafflevel())) {sql.SET("stafflevel = #{stafflevel}");}
			if(!Strings.isNullOrEmpty(entity.getLastlogintime())) {sql.SET("lastlogintime = #{lastlogintime}");}
			if(!Objects.isNull(entity.getLogincount())) {sql.SET("logincount = #{logincount}");}
			if(!Objects.isNull(entity.getRole())) {sql.SET("role = #{role}");}
			if(!Objects.isNull(entity.getIp())) {sql.SET("ip = #{ip}");}
			sql.SET("updatetime = now()");
		sql.WHERE("id = #{id}");
		//System.out.println(sql.toString()+"@@@@"+entity);
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaStaff(long id) {
		SQL sql = new SQL().DELETE_FROM("pa_staff");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(long id) {
		SQL sql = new SQL().UPDATE("pa_staff");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 根据角色逻辑删除用户
	 * @param roleId
	 * @return
	 */
	public String deleteByRole(long roleId) {
		SQL sql = new SQL().UPDATE("pa_staff");
		sql.SET("state=2");
		sql.WHERE("role = #{roleId}");
		return sql.toString();
	}
}
