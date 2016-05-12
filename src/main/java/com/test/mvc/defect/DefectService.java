package com.test.mvc.defect;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class DefectService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(DefectService.class);
	
	public static final DefectService service = Enhancer.enhance(DefectService.class);
	
}
