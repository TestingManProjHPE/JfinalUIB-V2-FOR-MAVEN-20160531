package com.test.mvc.accessrestful;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;

import com.platform.mvc.base.BaseService;

public class AccessRestfulService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(AccessRestfulService.class);
	
	public static final AccessRestfulService service = Enhancer.enhance(AccessRestfulService.class);
	
}
