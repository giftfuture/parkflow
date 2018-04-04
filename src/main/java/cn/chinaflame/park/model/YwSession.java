package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 
 * modle
 */
public class YwSession extends BaseModel {

	private Long id;
	private String sessionid;
	private String project_id;
	private String userid;
	private Long create_timestamp;
	private Long update_timestamp;
	private Long period;
	private String object;
	private String ip;
	private String createtime;
	private String updatetime;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getSessionid() {return sessionid;}
public void setSessionid(String sessionid) {this.sessionid = sessionid;}
public String getProject_id() {return project_id;}
public void setProject_id(String project_id) {this.project_id = project_id;}
public String getUserid() {return userid;}
public void setUserid(String userid) {this.userid = userid;}
public Long getCreate_timestamp() {return create_timestamp;}
public void setCreate_timestamp(Long create_timestamp) {this.create_timestamp = create_timestamp;}
public Long getUpdate_timestamp() {return update_timestamp;}
public void setUpdate_timestamp(Long update_timestamp) {this.update_timestamp = update_timestamp;}
public Long getPeriod() {return period;}
public void setPeriod(Long period) {this.period = period;}
public String getObject() {return object;}
public void setObject(String object) {this.object = object;}
public String getIp() {return ip;}
public void setIp(String ip) {this.ip = ip;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
