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
		
		if(command.equals("employees_list")) {
			action = new employeesListAction();
		}else if(command.equals("employees_write_form")) {
			action = new employeesWriteFormAction();
		}else if(command.equals("employees_write")) {
			action = new employeesWriteAction();
		}else if(command.equals("employees_view")) {
			action = new employeesViewAction();
		}else if(command.equals("employees_update_form")) {
			action = new employeesUpdateFormAction();
		}else if(command.equals("employees_update")) {
			action = new employeesUpdateAction();
		}else if(command.equals("employees_delete")) {
			action = new employeesDeleteAction();
		}
		return action;
	}
}
