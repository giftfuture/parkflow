package cn.chinaflame.park.test;

import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;

public class MyBusinessProcessTest {
	  public static void main(String[] args) {
		    ProcessEngineConfiguration
		      .createProcessEngineConfigurationFromResourceDefault()
		      .setDatabaseSchemaUpdate(ProcessEngineConfigurationImpl.DB_SCHEMA_UPDATE_CREATE)
		      .buildProcessEngine();
		  }
}
