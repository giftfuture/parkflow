package cn.chinaflame.park.consts;
/**
 * Description: 
 * 
 * 
 *
 */

public class WorkFlowConstant {
	/**
	 * 流程发起人
	 */
	public static final String WORK_FLOW_START_USER = "work_flow_start_user";

	/**
	 * 流程发起人
	 */
	public static final String WORK_FLOW_NEXT_STEP_USER = "work_flow_next_step_user";

	/**
	 * 会签人员参数
	 */
	public static final String WORK_FLOW_SIGN_USERS = "work_flow_sign_users";

	/**
	 * 关系表主键
	 */
	public static final String WORK_FLOW_RELATION_ID = "work_flow_relation_id";

	/**
	 * 上一处理人
	 */
	public static final String WORK_FLOW_PREVIOUS_USER = "work_flow_previous_user";
	
	/**
	 * 上一处理人姓名
	 */
	public static final String WORK_FLOW_PREVIOUS_USERNAME = "work_flow_previous_username";

	/**
	 * 上一步骤名称
	 */
	public static final String WORK_FLOW_PREVIOUS_STEP = "work_flow_previous_step";
	
	/**
	 * 指定的处理人
	 */
	public static final String WORK_FLOW_HANDLER = "work_flow_handler";
	
	/**
	 * EXECUTION_ID
	 */
	public static final String WORK_FLOW_EXECUTIONID = "work_flow_executionid";
	
	/**
	 * 退回任务
	 */
	public static final String WORK_FLOW_ROLLBACK_TASK = "work_flow_rollback_task";
	
	/**
	 * 首次处理该任务
	 */
	public static final String WORK_FLOW_FIRST_OPEN_TASK = "work_flow_first_open_task";
	
	/**
	 * 任务拥有者
	 */
	public static final String TASK_OWNER = "task_owner";
	
	/**
	 * 流程名称
	 */
	public static final String WORK_FLOW_MAIN_NAME = "work_flow_main_name";
	/**
	 * 流程id
	 */
	public static final String WORK_FLOW_MAIN_ID = "work_flow_main_id";
	

	public static final int RESOURCE_MENU = 0; // 菜单
	public final static String VACATION = "SVacation"; //业务类型为请假业务 TVacation,CounterSign,MailTest,WebserviceTest,SVacation
	public final static String MODEL_KEY = "modelkey"; //获取业务实体的KEY
	public final static double PERCENT = 0.6; //通过率
	public final static String MAILKEY = "MailTest";//发送邮件流程的KEY值
	public final static String MAIL_ADDRESS = "18092035350@163.com";//发送邮件的默认系统地址
	
	/**
	 * 自动生成编码前缀,必须为两位大写字母
	 */
	public static enum prefixCode{
		NO("资源编码","NO"),
		SN("资源编码","SN");
		//...
		private String name;
		private String value;
		private prefixCode(String name,String value){
			this.name = name;
			this.value = value;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	
	/**
	 * TVacation(请假表) 请假状态
	 */
	public static enum vacationStatus{
		APPROVING("正在审批",1),
		PASSED("审批通过",2),
		NOT_PASSED("审批不通过",3);
		
		private String name;
		private Integer value;
		
		private vacationStatus(String name,Integer value){
			this.name = name;
			this.value = value;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getValue() {
			return value;
		}
		public void setValue(Integer value) {
			this.value = value;
		}
	}
	
	/**
	 * TVacation(请假表) 请假类型
	 */
	public static enum vacationType{
		PERSONAL("事假",1),
		SICK("病假",2);
		
		private String name;
		private Integer value;
		
		private vacationType(String name,Integer value){
			this.name = name;
			this.value = value;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getValue() {
			return value;
		}
		public void setValue(Integer value) {
			this.value = value;
		}
	}

}
 
