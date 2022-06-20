package com.emp.controller.action;

public class ActionFactory{ //핸들러
	
	public ActionFactory() {
		super();
	}
	
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("emp_list")) {
			action = new empListFormAction();
		}else if(command.equals("emp_write_form_action")) {
			action = new empWriteFormAction();
		}else if(command.equals("emp_write_action")) {
			action = new empWriteAction();
		}else if(command.equals("emp_view")) {
			action = new empViewAction();
		}else if(command.equals("emp_update_form_action")) {
			action = new empUpdateFormAction();
		}else if(command.equals("emp_update_action")) {
			action = new empUpdateAction();
		}else if(command.equals("emp_delete_action")) {
			action = new empDeleteAction();
		}
		return action;
	}
}
