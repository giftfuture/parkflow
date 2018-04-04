package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActGeBytearray extends BaseModel {

	private String id;
	private Integer rev;
	private String name;
	private String deploymentId;
	private String bytes;
	private Integer generated;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getDeploymentId() {return deploymentId;}
public void setDeploymentId(String deploymentId) {this.deploymentId = deploymentId;}
public String getBytes() {return bytes;}
public void setBytes(String bytes) {this.bytes = bytes;}
public Integer getGenerated() {return generated;}
public void setGenerated(Integer generated) {this.generated = generated;}

	
}
