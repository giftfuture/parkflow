package cn.chinaflame.park.util;

public class SysConst {
	/*联系人默认选中常量信息*/
	public static final String ContactDefaultsYes = "1";
	public static final String ContactDefaultsNo = "0";
	
	/*session 超时时间，毫秒*/
	public static final Long SESSION_TIMEOUT = 120 * 60 * 1000L;
	/*项目编码*/
	public static final String PROJECT_CODE_PARK = "PARK";
	/*乐园登录渠道码*/
	public static final String PARK_CHANNEL_BACK = "BACK";
	public static final String PARK_CHANNEL_WEBSITE = "WEBSITE";
	
	/*支付交易渠道：1-乐园后台；2-乐园官网；3-微信公众号；4-一体机；5-智能POS机；*/
	public static final String PAY_CHANNEL_BACK = "1";
	public static final String PAY_CHANNEL_WEBSITE = "2";
	public static final String PAY_CHANNEL_WECHAT = "3";
	public static final String PAY_CHANNEL_MACHINE = "4";
	public static final String PAY_CHANNEL_POS = "5";
	
	/*官网订单列表查询sql*/
	public static final String ORDER_LIST_WEBCHAT_SQL = "select * from (select order_id,product_id,count(*) as product_count,"
			+ "case when count(*)-count(product_status='T') = 0 then '0' when count(*)-count(product_status='T') = count(*) then '1'"
			+ " else '2' end as use_status," + 
			" sum(money) as money,DATE_FORMAT(order_add_time,'%Y-%m-%d %H:%i:%s') as order_add_time,product_name,pay_status,order_type" + 
			" from vw_orderitem_order where purchase_member_id=#{memberId} and trans_type='PAY' and pay_channel='2' and order_type='2' and pay_status='2'" + 
			" group by order_id,product_id,product_name" + 
			" union all " + 
			" select ord.id as order_id,ord.goods_id as product_id,1 as product_count, null as use_status, ord.money as money," + 
			" DATE_FORMAT(ord.add_time,'%Y-%m-%d %H:%i:%s') as order_add_time,goods.goods_name as product_name,ord.pay_status as pay_status,ord.order_type" + 
			" from yw_order ord,vw_goods goods where member_id=#{memberId} and trans_type='PAY' and pay_channel='2' and ord.order_type='1' and pay_status='2' and ord.goods_id=goods.goods_id" +
			") tab ";
	public static final String ORDER_LIST_WEBCHAT_COUNT_SQL = "select count(*) from (select order_id,product_id,count(*) as product_count,"
			+ "case when count(*)-count(product_status='T') = 0 then '0' when count(*)-count(product_status='T') = count(*) then '1'"
			+ " else '2' end as use_status," + 
			" sum(money) as money,DATE_FORMAT(order_add_time,'%Y-%m-%d %H:%i:%s') as order_add_time,product_name,pay_status,order_type" + 
			" from vw_orderitem_order where purchase_member_id=#{memberId} and trans_type='PAY' and pay_channel='2' and order_type='2' and pay_status='2'" + 
			" group by order_id,product_id,product_name" + 
			" union all " + 
			" select ord.id as order_id,ord.goods_id as product_id,1 as product_count, null as use_status, ord.money as money," + 
			" DATE_FORMAT(ord.add_time,'%Y-%m-%d %H:%i:%s') as order_add_time,goods.goods_name as product_name,ord.pay_status as pay_status,ord.order_type" + 
			" from yw_order ord,vw_goods goods where member_id=#{memberId} and trans_type='PAY' and pay_channel='2' and ord.order_type='1' and pay_status='2' and ord.goods_id=goods.goods_id" +
			") tab ";
	public static final String ORDER_LIST_WEBCHAT_WHERE = "where tab.use_status=#{useStatus}";
	public static final String ORDER_LIST_WEBCHAT_PAGE = " order by order_add_time desc limit #{limit},#{limitLen}";
	
	
}
