package com.test.mvc.defect;

import java.io.Serializable;

import java.sql.Date; 

import org.apache.log4j.Logger;

/**
 *  DTO
 * @author 董华健
 */
public class DefectDto implements Serializable {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Defect.class);
	
	private String defect_id;
	private String system;
	private String module;
	private String target_cycle;
	private String target_release;
	private String def_type;
	private String def_status;
	private String assignedto;
	private String detected_by;
	private Date deteded_date;
	private String priority;
	private String description;
	private String summary;
	private String attachment;

	public void setDefect_id(String defect_id){
		this.defect_id = defect_id;
	}
	public String getDefect_id() {
		return defect_id;
	}
	public void setSystem(String system){
		this.system = system;
	}
	public String getSystem() {
		return system;
	}
	public void setModule(String module){
		this.module = module;
	}
	public String getModule() {
		return module;
	}
	public void setTarget_cycle(String target_cycle){
		this.target_cycle = target_cycle;
	}
	public String getTarget_cycle() {
		return target_cycle;
	}
	public void setTarget_release(String target_release){
		this.target_release = target_release;
	}
	public String getTarget_release() {
		return target_release;
	}
	public void setDef_type(String def_type){
		this.def_type = def_type;
	}
	public String getDef_type() {
		return def_type;
	}
	public void setDef_status(String def_status){
		this.def_status = def_status;
	}
	public String getDef_status() {
		return def_status;
	}
	public void setAssignedto(String assignedto){
		this.assignedto = assignedto;
	}
	public String getAssignedto() {
		return assignedto;
	}
	public void setDetected_by(String detected_by){
		this.detected_by = detected_by;
	}
	public String getDetected_by() {
		return detected_by;
	}
	public void setDeteded_date(Date deteded_date){
		this.deteded_date = deteded_date;
	}
	public Date getDeteded_date() {
		return deteded_date;
	}
	public void setPriority(String priority){
		this.priority = priority;
	}
	public String getPriority() {
		return priority;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setSummary(String summary){
		this.summary = summary;
	}
	public String getSummary() {
		return summary;
	}
	public void setAttachment(String attachment){
		this.attachment = attachment;
	}
	public String getAttachment() {
		return attachment;
	}
	
}
