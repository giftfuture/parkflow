package park1;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

/**
 * 
 * @author  created by boming
 * @date    2018年3月6日 上午9:31:01
 */
public class ModelGeneratorMain {

	public static void main(String[] args) {
		String tables = "ACT_GE_BYTEARRAY, ACT_GE_PROPERTY, ACT_HI_ACTINST, ACT_HI_ATTACHMENT, ACT_HI_COMMENT, ACT_HI_DETAIL, ACT_HI_IDENTITYLINK,"
				+ " ACT_HI_PROCINST, ACT_HI_TASKINST, ACT_HI_VARINST, ACT_ID_GROUP, ACT_ID_INFO, ACT_ID_MEMBERSHIP, ACT_ID_USER, ACT_PROCDEF_INFO,"
				+ " ACT_RE_DEPLOYMENT, ACT_RE_MODEL, ACT_RE_PROCDEF, ACT_RU_EVENT_SUBSCR, ACT_RU_EXECUTION, ACT_RU_IDENTITYLINK, ACT_RU_JOB, "
				+ "ACT_RU_TASK, ACT_RU_VARIABLE, pa_sys_vars";
		//String [] tbs = tables.split(",");
		/*for(String str:tbs) {
		}*/
		ModelGeneratorUtil.generateTable("pa_user_task");  //table generator
//		ModelViewGeneratorUtil.generateTable("test");  //view generator
		//ModelTestDataGenerator.generateDataByTable("ACT_EVT_LOG");  //table test data generator
	}
}
