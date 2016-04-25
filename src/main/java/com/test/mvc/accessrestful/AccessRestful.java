package com.test.mvc.accessrestful;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;


import org.apache.log4j.Logger;

/**
 *  model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "access_restful", pkName = "ids")
public class AccessRestful extends BaseModel<AccessRestful> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(AccessRestful.class);
	
	public static final AccessRestful dao = new AccessRestful();
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_ids = "ids";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：200
	 */
	public static final String column_baseurl = "baseurl";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_username = "username";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_password = "password";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_access_cycle = "access_cycle";
	
	/**
	 * 字段描述： 
	 * 字段类型：integer  长度：null
	 */
	public static final String column_access_type = "access_type";
	
	
	/**
	 * sqlId : test.accessRestful.splitPage
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "test.accessRestful.splitPage";

	private String ids;
	private String baseurl;
	private String username;
	private String password;
	private String access_cycle;
	private String access_type;
	
	public void setIds(String ids){
		set(column_ids, ids);
	}
	public String getIds() {
		return get(column_ids);
	}
	public void setBaseurl(String baseurl){
		set(column_baseurl, baseurl);
	}
	public String getBaseurl() {
		return get(column_baseurl);
	}
	public void setUsername(String username){
		set(column_username, username);
	}
	public String getUsername() {
		return get(column_username);
	}
	public void setPassword(String password){
		set(column_password, password);
	}
	public String getPassword() {
		return get(column_password);
	}
	public void setAccess_cycle(String access_cycle){
		set(column_access_cycle, access_cycle);
	}
	public String getAccess_cycle() {
		return get(column_access_cycle);
	}
	public void setAccess_type(Integer access_type){
		set(column_access_type, access_type);
	}
	public Integer getAccess_type() {
		return get(column_access_type);
	}
	
}
