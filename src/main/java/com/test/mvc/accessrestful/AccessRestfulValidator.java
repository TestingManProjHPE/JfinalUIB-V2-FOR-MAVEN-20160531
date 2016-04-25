package com.test.mvc.accessrestful;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class AccessRestfulValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(AccessRestfulValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/test/accessRestful/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/test/accessRestful/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(AccessRestful.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/test/accessRestful/save")){
			controller.render("/test/xxx.html");
		
		} else if (actionKey.equals("/jf/test/accessRestful/update")){
			controller.render("/test/xxx.html");
		
		}
	}
	
}
