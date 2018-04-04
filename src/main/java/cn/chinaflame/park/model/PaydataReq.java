package cn.chinaflame.park.model;


/**
* @author    created by wwt
* @date	     2018年1月16日 下午4:36:58
**/
public class PaydataReq  {
	private String inputCharset;		//字符集 默认填 1；1 代表 UTF-8、2 代表 GBK、3 代表GB2312；		必填
    private String returnUrl;			//付款客户的取货 url 地址		B2C/B2B/PC/WAP/H5支付必填
    private String notifyUrl;			//服务器接受支付结果的后台地址	通知商户网站支付结果的 url 地址		必填
    private String version;			    //网关接收支付请求接口版本	固定填 v1.0					必填
    private String language;			//网关页面显示语言种类		默认填 1，固定选择值：1；1 代表简体中文、2 代表繁体中文、3 代表英文
    private String orderNo;				//商户订单号		商户提交的订单号，必须在当天的该商户所有交易中唯一	必填		
    private String orderCurrency;		//订单金额币种 类型	默认填 0	  								必填
    private String orderDatetime;		//商户订单提交时间			日期格式：yyyyMMDDhhmmss，例如：		必填
    private String payType;				//支付卡类型		33 手机 H5 支付/PC 快捷支付				必填
    private String issuerId;			//发卡方代码		银行或预付卡发卡机构代码，用于指定支付使用的付款方机构。
    private String sign;				//签名字符串		签名串生成机制：按上述顺序所有非空参数与密钥key 组合，经加密后生成 sign	必填
    private String orderAmount;			//商户订单金额		整型数字，金额与币种有关						必填
    private String merchantId;			//商户号			数字串，商户在炎武申请开户的商户号				必填
    private String tradeType;			//交易类型		固定值：PAY		必填
    private String payWay;				// payWay		默认：allinpay	必填
    private String tradeChannel;		//交易端			online线上网页，offline线下窗口，wechat线上微信公众号   		必填		
    private String tradeMethod;			//支付方式		fastbank银行卡快捷,qrcode微信支付宝二维码，wechatjs微信js支付，alipayjs支付宝js支付，									//				generalpos普通pos刷卡，inteligencepos智能pos刷卡，ebank网银支付	必填		
    private String userId;				//				H5为必填
    private String acct;				//openid 
    private String authcode;			//刷卡支付付款码
    private String subMerchantId;		//商户号
    private String refundAmount;		//退款金额		整型数字，金额与币种有关						必填
    private	String mchtRefundOrderNo;	//商户退款订单号	
    private String signMsg;				//签名字符串
    private String serialno;			//
    private String oldOrderId;			//


	public String getInputCharset() {
		return inputCharset;
	}


	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
	}


	public String getReturnUrl() {
		return returnUrl;
	}


	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}


	public String getNotifyUrl() {
		return notifyUrl;
	}


	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public String getOrderCurrency() {
		return orderCurrency;
	}


	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}


	public String getOrderDatetime() {
		return orderDatetime;
	}


	public void setOrderDatetime(String orderDatetime) {
		this.orderDatetime = orderDatetime;
	}


	public String getPayType() {
		return payType;
	}


	public void setPayType(String payType) {
		this.payType = payType;
	}


	public String getIssuerId() {
		return issuerId;
	}


	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}


	public String getSign() {
		return sign;
	}


	public void setSign(String sign) {
		this.sign = sign;
	}


	public String getOrderAmount() {
		return orderAmount;
	}


	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}


	public String getMerchantId() {
		return merchantId;
	}


	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}


	public String getTradeType() {
		return tradeType;
	}


	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}


	public String getPayWay() {
		return payWay;
	}


	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}


	public String getTradeChannel() {
		return tradeChannel;
	}


	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}


	public String getTradeMethod() {
		return tradeMethod;
	}


	public void setTradeMethod(String tradeMethod) {
		this.tradeMethod = tradeMethod;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getRefundAmount() {
		return refundAmount;
	}


	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}


	public String getMchtRefundOrderNo() {
		return mchtRefundOrderNo;
	}


	public void setMchtRefundOrderNo(String mchtRefundOrderNo) {
		this.mchtRefundOrderNo = mchtRefundOrderNo;
	}


	public String getSignMsg() {
		return signMsg;
	}


	public void setSignMsg(String signMsg) {
		this.signMsg = signMsg;
	}


	public String getSerialno() {
		return serialno;
	}


	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}


	public String getOldOrderId() {
		return oldOrderId;
	}


	public void setOldOrderId(String oldOrderId) {
		this.oldOrderId = oldOrderId;
	}


	public String getAcct() {
		return acct;
	}


	public void setAcct(String acct) {
		this.acct = acct;
	}


	public String getSubMerchantId() {
		return subMerchantId;
	}


	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}


	public String getAuthcode() {
		return authcode;
	}


	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}
	
	
	
	
	
	
	
	

    
	
	
}
