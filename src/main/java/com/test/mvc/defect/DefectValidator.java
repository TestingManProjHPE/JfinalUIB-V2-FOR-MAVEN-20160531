package com.test.mvc.defect;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class DefectValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(DefectValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/test/defect/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/jf/test/defect/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Defect.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/test/defect/save")){
			controller.render("/test/xxx.html");
		
		} else if (actionKey.equals("/jf/test/defect/update")){
			controller.render("/test/xxx.html");
		
		}
	}
	
}
