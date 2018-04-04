package cn.chinaflame.park.model;

import java.lang.String;

/**
 * 
 * modle
 */
public class ActIdMembership extends BaseModel {

	private String userId;
	private String groupId;


	public String getUserId() {return userId;}
public void setUserId(String userId) {this.userId = userId;}
public String getGroupId() {return groupId;}
public void setGroupId(String groupId) {this.groupId = groupId;}

	
}
