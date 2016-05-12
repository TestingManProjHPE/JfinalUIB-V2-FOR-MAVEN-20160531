package com.test.mvc.defect;

import com.platform.annotation.Table;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseModel;

import java.sql.Date; 

import org.apache.log4j.Logger;

/**
 *  model
 * @author 董华健  dongcb678@163.com
 */
@SuppressWarnings("unused")
//@Table(tableName = "defect", pkName = "defect_id")
public class Defect extends BaseModel<Defect> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Defect.class);
	
	public static final Defect dao = new Defect();
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：32
	 */
	public static final String column_defect_id = "defect_id";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_system = "system";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_module = "module";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_target_cycle = "target_cycle";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_target_release = "target_release";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_def_type = "def_type";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_def_status = "def_status";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_assignedto = "assignedto";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_detected_by = "detected_by";
	
	/**
	 * 字段描述： 
	 * 字段类型：date  长度：null
	 */
	public static final String column_deteded_date = "deteded_date";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：50
	 */
	public static final String column_priority = "priority";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：2000
	 */
	public static final String column_description = "description";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：2000
	 */
	public static final String column_summary = "summary";
	
	/**
	 * 字段描述： 
	 * 字段类型：character varying  长度：10
	 */
	public static final String column_attachment = "attachment";
	
	
	/**
	 * sqlId : test.defect.splitPage
	 * 描述：分页from
	 */
	public static final String sqlId_splitPage_from = "test.defect.splitPage";

	private String defect_id;
	private String system;
	private String module;
	private String target_cycle;
	private String target_release;
	private String def_type;
	private String def_status;
	private String assignedto;
	private String detected_by;
	private String deteded_date;
	private String priority;
	private String description;
	private String summary;
	private String attachment;
	
	public void setDefect_id(String defect_id){
		set(column_defect_id, defect_id);
	}
	public String getDefect_id() {
		return get(column_defect_id);
	}
	public void setSystem(String system){
		set(column_system, system);
	}
	public String getSystem() {
		return get(column_system);
	}
	public void setModule(String module){
		set(column_module, module);
	}
	public String getModule() {
		return get(column_module);
	}
	public void setTarget_cycle(String target_cycle){
		set(column_target_cycle, target_cycle);
	}
	public String getTarget_cycle() {
		return get(column_target_cycle);
	}
	public void setTarget_release(String target_release){
		set(column_target_release, target_release);
	}
	public String getTarget_release() {
		return get(column_target_release);
	}
	public void setDef_type(String def_type){
		set(column_def_type, def_type);
	}
	public String getDef_type() {
		return get(column_def_type);
	}
	public void setDef_status(String def_status){
		set(column_def_status, def_status);
	}
	public String getDef_status() {
		return get(column_def_status);
	}
	public void setAssignedto(String assignedto){
		set(column_assignedto, assignedto);
	}
	public String getAssignedto() {
		return get(column_assignedto);
	}
	public void setDetected_by(String detected_by){
		set(column_detected_by, detected_by);
	}
	public String getDetected_by() {
		return get(column_detected_by);
	}
	public void setDeteded_date(Date deteded_date){
		set(column_deteded_date, deteded_date);
	}
	public Date getDeteded_date() {
		return get(column_deteded_date);
	}
	public void setPriority(String priority){
		set(column_priority, priority);
	}
	public String getPriority() {
		return get(column_priority);
	}
	public void setDescription(String description){
		set(column_description, description);
	}
	public String getDescription() {
		return get(column_description);
	}
	public void setSummary(String summary){
		set(column_summary, summary);
	}
	public String getSummary() {
		return get(column_summary);
	}
	public void setAttachment(String attachment){
		set(column_attachment, attachment);
	}
	public String getAttachment() {
		return get(column_attachment);
	}
	
}
