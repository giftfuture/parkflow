package cn.chinaflame.park.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaMember;
import cn.chinaflame.park.model.PaVenue;
import cn.chinaflame.park.vo.PaVenueVO;

/**
* @author    created by lbq
* @date	     2018年2月26日 下午4:45:00
**/
public interface Venue {
	@Select("<script> "
			+ "SELECT * FROM pa_venue a where 1=1 "
			+ "and a.venue_status='1' "
			+ "<if test='grade!=null'> "
			+ "and a.venue_grade=#{grade} "
			+ "</if>"
			+ "</script>")
	public List<PaVenue> query(@Param("grade") String grade);
	
	/*@Select("SELECT * FROM pa_venue a where a.venue_grade=#{grade} and a.venue_status='1'  ;")
	public List<PaVenue> query(@Param("grade") String grade);*/
	
	/**
	 * 添加场馆
	 * @param name
	 * @param phone
	 * @param contact
	 * @param grade
	 * @param father
	 * @param user
	 * @param remarks
	 * @param description
	 * @param start
	 * @param end
	 * @return
	 */
	@Insert("INSERT INTO pa_venue (venue_name,venue_contact,venue_phone,venue_grade,venue_father,"
			+ "venue_authorized,venue_status,venue_description,venue_user,venue_remarks,venue_start_time,venue_end_time,"
			+ " venue_image1,venue_image2,venue_image3,venue_image4) VALUES"
			+ "(#{name},#{contact},#{phone},#{grade},#{father},'1','1',#{description},#{user},#{remarks},#{start},#{end},"
			+ "#{image1},#{image2},#{image3},#{image4} )")
	public int add(@Param("name") String name,@Param("phone")String phone,@Param("contact")String contact,
				   @Param("grade")String grade,@Param("father")String father,@Param("user")String user,
				   @Param("remarks")String remarks,@Param("description")String description,@Param("start") String start,
				   @Param("end") String end, @Param("image1") String image1,@Param("image2") String image2,
				   @Param("image3") String image3,@Param("image4") String image4);
	 	 
	/**
	 * 修改场馆接口
	 * @param id
	 * @param name
	 * @param phone
	 * @param contact
	 * @param grade
	 * @param father
	 * @param status
	 * @param remarks
	 * @param description
	 * @return
	 */
	@Update("UPDATE pa_venue a set a.venue_name=#{name},a.venue_contact=#{contact},a.venue_phone=#{phone},"
			+ "a.venue_grade=#{grade},a.venue_father=#{father}, a.venue_status=#{status},a.venue_description=#{description},"
			+ "a.venue_remarks=#{remarks},a.venue_start_time=#{start},venue_end_time=#{end},venue_image1=#{image1},"
			+ "venue_image2=#{image2},venue_image3=#{image3},venue_image4=#{image4}  where a.venue_id=#{id}")
	public int update(@Param("id") int id,  @Param("name") String name,@Param("phone")String phone,@Param("contact")String contact,
			   @Param("grade")String grade,@Param("father")String father,@Param("status") String status,
			   @Param("remarks")String remarks,@Param("description")String description,@Param("start") String start,
			   @Param("end") String end,@Param("image1") String image1,@Param("image2") String image2,
			   @Param("image3") String image3,@Param("image4") String image4 );
	
	@Select("SELECT * FROM pa_venue a where a.venue_id=#{id}")
	public PaVenueVO queryById(@Param("id") Integer id);
	
	
	
	@Delete("delete from pa_venue where venue_id=#{id}")
	public PaVenue delete(@Param("id") Integer id);
	
	/**
	 * 根据场馆号查询多条场馆信息
	 * @param venun_id
	 * @return
	 */
	@Select("select * from pa_venue where FIND_IN_SET (venue_id,#{venun_id})>0;")
	public List<PaVenue> queryVenunId(@Param("venun_id") String venun_id);
//------------------------------商户商户商户商户商户商户商户---------------------------------
	
	
	/**
	 * 商户列表查询接口
	 * @return
	 */
	@Select("SELECT a.merchants_id,b.venue_id, a.merchants_name,b.venue_name from "
			+ "pa_merchant a INNER JOIN pa_venue b ON (a.merchants_venue_id=b.venue_id) "
			+ " where 1=1 and a.state='1'  "
			+ " UNION SELECT c.merchants_id, 0 AS venue_id, c.merchants_name, "
			+ " '乐园' AS venue_name FROM pa_merchant c "
			+ " WHERE c.merchants_venue_id = '0' AND c.state = '1' ")
	public List<Map<String, Object>> queryMerchant();
	/**
	 * 根据场馆条件查询接口
	 * @return
	 */
	@Select("<script> "
			+ " SELECT  a.merchants_id,b.venue_id,a.merchants_name,b.venue_name from pa_merchant a INNER JOIN pa_venue b ON (a.merchants_venue_id=b.venue_id) "
			+ "where 1=1"
			+ "<if test='venueId!=null'>"
			+ " and a.merchants_venue_id=#{venueId} "
			+ "</if> "
			+ "  and a.state='1'  "
			+ "</script> ")
	public List<Map<String, Object>> queryByVenueId(@Param("venueId")Integer venueId);
	
 	/**
 	 * 单个商户查询接口
 	 * @param id
 	 * @return
 	 */
	@Select("select a.*,b.venue_name from pa_merchant a INNER JOIN pa_venue b ON (a.merchants_venue_id=b.venue_id) where a.merchants_id=#{merchantsId}")
	public List<Map<String, Object>> queryMerById(@Param("merchantsId") String merchantsId);
	
	
	/**
	 * 商户添加接口
	 * @param name  商户名称
	 * @param brandName 品牌名称
	 * @param businessLicense 营业执照
	 * @param legalPersonName 公司法人姓名
	 * @param corporateIdNumber 法人证件号码
	 * @param corporateAddress 法人户籍地址
	 * @param businessStartTime 营业执照有效开始时间
	 * @param businessEndTime 营业执照有效终止时间
	 * @param address 商户地址
	 * @param contact 联系人
	 * @param managerPhone 店长电话
	 * @param venueGrade 归属场馆等级
	 * @param venueId 归属场馆ID
	 * @param contractStartTime 合约开始时间
	 * @param contractEndTime 合约结束时间
	 * @param account 商户账户
	 * @param accountArea 收款账户所属地区
	 * @param accountOutlets 收款账户开户网点
	 * @param type 商户类型
	 * @param receiving 收款单位
	 * @param paymentType 付款类型
	 * @param companyBankCount 公司银行账户
	 * @param companyReceivingBank 公司收款银行
	 * @param user 录入人
	 * @return
	 */
	@Insert("INSERT INTO park.pa_merchant ("
			+ "merchants_name,  merchants_brand_name, "
			+ "merchants_business_license, merchants_legal_person_name, "
			+ "merchants_corporate_id_number,merchants_corporate_address, "
			+ "merchants_business_start_time, merchants_business_end_time,"
			+ "merchants_address, merchants_contact, "
			+ "merchants_manager_phone, merchants_venue_grade, "
			+ "merchants_venue_id, merchants_contract_start_time, "
			+ "merchants_contract_end_time, merchants_account, "
			+ "merchants_account_area, merchants_account_outlets, "
			+ "merchants_type, merchants_receiving, "
			+ "merchants_payment_type, merchants_company_bank_count, "
			+ "merchants_company_receiving_bank, merchants_user,state) "
			+ "VALUES ("
			+ "#{name}, #{brandName}, "
			+ "#{businessLicense}, #{legalPersonName}, "
			+ "#{corporateIdNumber}, #{corporateAddress}, "
			+ "#{businessStartTime}, #{businessEndTime}, "
			+ "#{address}, #{contact}, "
			+ "#{managerPhone},  #{venueGrade},"
			+ "#{venueId}, #{contractStartTime}, "
			+ "#{contractEndTime}, #{account}, "
			+ "#{accountArea}, #{accountOutlets}, "
			+ "#{type},  #{receiving}, "
			+ "#{paymentType}, #{companyBankCount}, "
			+ "#{companyReceivingBank}, "
			+ "#{user} );")
	public int addM(@Param("name") String name,@Param("brandName") String brandName,
			@Param("businessLicense") String businessLicense,@Param("legalPersonName") String legalPersonName,
			@Param("corporateIdNumber") String corporateIdNumber,@Param("corporateAddress") String corporateAddress,
			@Param("businessStartTime") String businessStartTime,@Param("businessEndTime") String businessEndTime,
			@Param("address") String address, @Param("contact") String contact,
			@Param("managerPhone") String managerPhone,@Param("venueGrade") String venueGrade,
			@Param("venueId") String venueId,@Param("contractStartTime") String contractStartTime,
			@Param("contractEndTime") String contractEndTime,@Param("account") String account,
			@Param("accountArea") String accountArea,@Param("accountOutlets") String accountOutlets,
			@Param("type") String type,@Param("receiving") String receiving,
			@Param("paymentType") String paymentType,@Param("companyBankCount") String companyBankCount,
			@Param("companyReceivingBank") String companyReceivingBank,@Param("user") String user );
	
/**
 * 修改商户
 * @param id
 * @param name
 * @param brandName
 * @param businessLicense
 * @param legalPersonName
 * @param corporateIdNumber
 * @param corporateAddress
 * @param businessStartTime
 * @param businessEndTime
 * @param address
 * @param contact
 * @param managerPhone
 * @param venueGrade
 * @param venueId
 * @param contractStartTime
 * @param contractEndTime
 * @param account
 * @param accountArea
 * @param accountOutlets
 * @param type
 * @return
 */
	@Update("UPDATE pa_merchant SET  "
			+ "merchants_name=#{name}, "
			+ "merchants_brand_name=#{brandName}, "
			+ "merchants_business_license=#{businessLicense}, "
			+ "merchants_legal_person_name=#{legalPersonName}, "
			+ "merchants_corporate_id_number=#{corporateIdNumber}, "
			+ "merchants_corporate_address=#{corporateAddress}, "
			+ "merchants_business_start_time=#{businessStartTime}, "
			+ "merchants_business_end_time=#{businessEndTime}, "
			+ "merchants_address=#{address}, "
			+ "merchants_contact=#{contact}, "
			+ "merchants_manager_phone=#{managerPhone}, "
			+ "merchants_venue_grade=#{venueGrade}, "
			+ "merchants_venue_id=#{venueId}, "
			+ "merchants_contract_start_time=#{contractStartTime}, "
			+ "merchants_contract_end_time=#{contractEndTime}, "
			+ "merchants_account=#{account}, "
			+ "merchants_account_area=#{accountArea}, "
			+ "merchants_account_outlets=#{accountOutlets}, "
			+ "merchants_type=#{type} "
			+ "WHERE (merchants_id=#{id});")
	public int updateM(@Param("id") int id,
			@Param("name") String name,@Param("brandName") String brandName,
			@Param("businessLicense") String businessLicense,@Param("legalPersonName") String legalPersonName,
			@Param("corporateIdNumber") String corporateIdNumber,@Param("corporateAddress") String corporateAddress,
			@Param("businessStartTime") String businessStartTime,@Param("businessEndTime") String businessEndTime,
			@Param("address") String address, @Param("contact") String contact,
			@Param("managerPhone") String managerPhone,@Param("venueGrade") String venueGrade,
			@Param("venueId") String venueId,@Param("contractStartTime") String contractStartTime,
			@Param("contractEndTime") String contractEndTime,@Param("account") String account,
			@Param("accountArea") String accountArea,@Param("accountOutlets") String accountOutlets,
			@Param("type") String type);
	
	/**
	 * 删除商户接口
	 * @param id
	 * @return
	 */
	@Delete("delete from pa_merchant where venue_id=#{id}")
	public int deleteM(@Param("id") Integer id);
	
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 */
	@Update("UPDATE pa_merchant SET state ='2' WHERE (merchants_id=#{id}) ")
	public int deleteLogicM(@Param("id") Integer id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//------------------------------------------------闸机-----------------------------------------------------
	/**
	 * 闸机查询列表接口
	 * @param venueId  场馆id
	 * @param status   闸机状态
	 * @return
	 */
	@Select("<script> "
			+ " SELECT a.gate_id,a.gate_name,a.gate_ip,a.gate_status,b.venue_id,b.venue_name "
			+ " from pa_gate a INNER JOIN pa_venue b ON (a.gate_venue_id=b.venue_id) "
			+ "where 1=1"
			+ "<if test='venueId!=null'>"
			+ " and a.gate_venue_id=#{venueId} "
			+ "</if>"
			+ "<if test='status!=null'>"
			+ " and a.gate_status=#{status} "
			+ "</if>"
			+ " and a.state='1'"
			+ "</script> ")
	public List<Map<String, Object>> list(@Param("venueId")Integer venueId,@Param("status")String status);
	/**
	 * 闸机单个查看
	 * @param id
	 * @return
	 */
	@Select("SELECT a.*,b.venue_id,b.venue_name,b.venue_grade  from pa_gate a INNER JOIN pa_venue b ON (a.gate_venue_id=b.venue_id)  where a.gate_id=#{id}")
	public List<Map<String, Object>> queryOneGate(@Param("id") Integer id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//--------------------------------------------微信会员---------------------------------
	
	@Select("select * from pa_member a where a.mobile=#{mobile}")
	public PaMember getMember(@Param("mobile") String mobile); 
	
	@Insert("insert into pa_member (mobile,password,createtime,updatetime) VALUES(#{mobile},#{password},now(),now())")
	public int addMember(@Param("mobile") String mobile,@Param("password")String password);
	
	
	
	
	
	
	
	
	
	
	/**
	 * 官网注册
	 * @param mobile
	 * @param password
	 * @param name
	 * @return
	 */
	@Insert("insert into pa_member (mobile,password,name,createtime,updatetime) VALUES(#{mobile},#{password},#{name},now(),now())")
	public int addMember2(@Param("mobile") String mobile,@Param("password")String password,@Param("name")String name);
	/**
	 * 官网修改用户登录密码
	 * @param mobile
	 * @param password
	 * @return
	 */
	@Update("UPDATE pa_member SET  password=#{password},updatetime=now() where mobile =#{mobile} ")
	public int updateTwo(@Param("mobile")String mobile,@Param("password")String password );
	
	/**
	 * 官网根据id修改用户登录密码
	 * @param id
	 * @param password
	 * @return
	 */
	@Update("UPDATE pa_member SET  password=#{password},updatetime=now() where id =#{id} ")
	public int updateById(@Param("id")int id,@Param("password")String password );
	/**
	 * 官网根据id获取用户优惠券数量
	 * @param id
	 * @return
	 */
	@Select("SELECT COUNT(*) from (pa_member a INNER JOIN pa_coupon b on(a.id=b.member_id)) where a.id =#{id} ")
	public int discountById(@Param("id")int id );
	
	
	
	
	
	
	/**
	 * 存储过程测试
	 * @param price
	 * @param deleteGoods
	 * @param goodsCount
	 * @return
	 */
	@Select(value= "{ CALL removeGoodsReturnInfos(#{price, mode=IN, jdbcType=INTEGER},#{a,mode=OUT,jdbcType=INTEGER},#{b,mode=OUT,jdbcType=INTEGER})}")
	@Options(statementType = StatementType.CALLABLE)
	public List<Map<String, Object>> call(Map<String, Object> map);
	
	
}








