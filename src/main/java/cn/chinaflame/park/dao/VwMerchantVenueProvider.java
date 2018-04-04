package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.VwMerchantVenue;

public class VwMerchantVenueProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwMerchantVenueByCount(VwMerchantVenue entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_merchant_venue");
					if(!Objects.isNull(entity.getMerchants_id())) {sql.WHERE("merchants_id = #{merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_name())) {sql.WHERE("merchants_name = #{merchants_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_name())) {sql.WHERE("merchants_company_name = #{merchants_company_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_brand_name())) {sql.WHERE("merchants_brand_name = #{merchants_brand_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_license())) {sql.WHERE("merchants_business_license = #{merchants_business_license}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_legal_person_name())) {sql.WHERE("merchants_legal_person_name = #{merchants_legal_person_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_corporate_id_number())) {sql.WHERE("merchants_corporate_id_number = #{merchants_corporate_id_number}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_corporate_address())) {sql.WHERE("merchants_corporate_address = #{merchants_corporate_address}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_start_time())) {sql.WHERE("merchants_business_start_time = #{merchants_business_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_end_time())) {sql.WHERE("merchants_business_end_time = #{merchants_business_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_authorized())) {sql.WHERE("merchants_authorized = #{merchants_authorized}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_address())) {sql.WHERE("merchants_address = #{merchants_address}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contact())) {sql.WHERE("merchants_contact = #{merchants_contact}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_manager_phone())) {sql.WHERE("merchants_manager_phone = #{merchants_manager_phone}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_venue_grade())) {sql.WHERE("merchants_venue_grade = #{merchants_venue_grade}");}
			if(!Objects.isNull(entity.getMerchants_venue_id())) {sql.WHERE("merchants_venue_id = #{merchants_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contract_start_time())) {sql.WHERE("merchants_contract_start_time = #{merchants_contract_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contract_end_time())) {sql.WHERE("merchants_contract_end_time = #{merchants_contract_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account())) {sql.WHERE("merchants_account = #{merchants_account}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account_area())) {sql.WHERE("merchants_account_area = #{merchants_account_area}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account_outlets())) {sql.WHERE("merchants_account_outlets = #{merchants_account_outlets}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_type())) {sql.WHERE("merchants_type = #{merchants_type}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_receiving())) {sql.WHERE("merchants_receiving = #{merchants_receiving}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_payment_type())) {sql.WHERE("merchants_payment_type = #{merchants_payment_type}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_bank_count())) {sql.WHERE("merchants_company_bank_count = #{merchants_company_bank_count}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_receiving_bank())) {sql.WHERE("merchants_company_receiving_bank = #{merchants_company_receiving_bank}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_user())) {sql.WHERE("merchants_user = #{merchants_user}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_name())) {sql.WHERE("venue_name = #{venue_name}");}

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
	public String selectVwMerchantVenueByLimt(VwMerchantVenue entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_merchant_venue");
					if(!Objects.isNull(entity.getMerchants_id())) {sql.WHERE("merchants_id = #{merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_name())) {sql.WHERE("merchants_name = #{merchants_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_name())) {sql.WHERE("merchants_company_name = #{merchants_company_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_brand_name())) {sql.WHERE("merchants_brand_name = #{merchants_brand_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_license())) {sql.WHERE("merchants_business_license = #{merchants_business_license}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_legal_person_name())) {sql.WHERE("merchants_legal_person_name = #{merchants_legal_person_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_corporate_id_number())) {sql.WHERE("merchants_corporate_id_number = #{merchants_corporate_id_number}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_corporate_address())) {sql.WHERE("merchants_corporate_address = #{merchants_corporate_address}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_start_time())) {sql.WHERE("merchants_business_start_time = #{merchants_business_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_end_time())) {sql.WHERE("merchants_business_end_time = #{merchants_business_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_authorized())) {sql.WHERE("merchants_authorized = #{merchants_authorized}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_address())) {sql.WHERE("merchants_address = #{merchants_address}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contact())) {sql.WHERE("merchants_contact = #{merchants_contact}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_manager_phone())) {sql.WHERE("merchants_manager_phone = #{merchants_manager_phone}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_venue_grade())) {sql.WHERE("merchants_venue_grade = #{merchants_venue_grade}");}
			if(!Objects.isNull(entity.getMerchants_venue_id())) {sql.WHERE("merchants_venue_id = #{merchants_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contract_start_time())) {sql.WHERE("merchants_contract_start_time = #{merchants_contract_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contract_end_time())) {sql.WHERE("merchants_contract_end_time = #{merchants_contract_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account())) {sql.WHERE("merchants_account = #{merchants_account}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account_area())) {sql.WHERE("merchants_account_area = #{merchants_account_area}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account_outlets())) {sql.WHERE("merchants_account_outlets = #{merchants_account_outlets}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_type())) {sql.WHERE("merchants_type = #{merchants_type}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_receiving())) {sql.WHERE("merchants_receiving = #{merchants_receiving}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_payment_type())) {sql.WHERE("merchants_payment_type = #{merchants_payment_type}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_bank_count())) {sql.WHERE("merchants_company_bank_count = #{merchants_company_bank_count}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_receiving_bank())) {sql.WHERE("merchants_company_receiving_bank = #{merchants_company_receiving_bank}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_user())) {sql.WHERE("merchants_user = #{merchants_user}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_name())) {sql.WHERE("venue_name = #{venue_name}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwMerchantVenue(VwMerchantVenue entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_merchant_venue");
			if(!Objects.isNull(entity.getMerchants_id())) {sql.WHERE("merchants_id = #{merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_name())) {sql.WHERE("merchants_name = #{merchants_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_name())) {sql.WHERE("merchants_company_name = #{merchants_company_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_brand_name())) {sql.WHERE("merchants_brand_name = #{merchants_brand_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_license())) {sql.WHERE("merchants_business_license = #{merchants_business_license}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_legal_person_name())) {sql.WHERE("merchants_legal_person_name = #{merchants_legal_person_name}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_corporate_id_number())) {sql.WHERE("merchants_corporate_id_number = #{merchants_corporate_id_number}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_corporate_address())) {sql.WHERE("merchants_corporate_address = #{merchants_corporate_address}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_start_time())) {sql.WHERE("merchants_business_start_time = #{merchants_business_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_business_end_time())) {sql.WHERE("merchants_business_end_time = #{merchants_business_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_authorized())) {sql.WHERE("merchants_authorized = #{merchants_authorized}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_address())) {sql.WHERE("merchants_address = #{merchants_address}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contact())) {sql.WHERE("merchants_contact = #{merchants_contact}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_manager_phone())) {sql.WHERE("merchants_manager_phone = #{merchants_manager_phone}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_venue_grade())) {sql.WHERE("merchants_venue_grade = #{merchants_venue_grade}");}
			if(!Objects.isNull(entity.getMerchants_venue_id())) {sql.WHERE("merchants_venue_id = #{merchants_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contract_start_time())) {sql.WHERE("merchants_contract_start_time = #{merchants_contract_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_contract_end_time())) {sql.WHERE("merchants_contract_end_time = #{merchants_contract_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account())) {sql.WHERE("merchants_account = #{merchants_account}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account_area())) {sql.WHERE("merchants_account_area = #{merchants_account_area}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_account_outlets())) {sql.WHERE("merchants_account_outlets = #{merchants_account_outlets}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_type())) {sql.WHERE("merchants_type = #{merchants_type}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_receiving())) {sql.WHERE("merchants_receiving = #{merchants_receiving}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_payment_type())) {sql.WHERE("merchants_payment_type = #{merchants_payment_type}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_bank_count())) {sql.WHERE("merchants_company_bank_count = #{merchants_company_bank_count}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_company_receiving_bank())) {sql.WHERE("merchants_company_receiving_bank = #{merchants_company_receiving_bank}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_user())) {sql.WHERE("merchants_user = #{merchants_user}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_name())) {sql.WHERE("venue_name = #{venue_name}");}

		return sql.toString();
	}
}
