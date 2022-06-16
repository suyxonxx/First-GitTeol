package com.employees.controller;

import com.employees.controller.action.Action;
import com.employees.controller.action.*;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory working by " + command);
		
		if(command.equals("list")) {
			action = new ListAction();
		} else if(command.equals("write_form")) {
			action = new WriteFormAction();
		} else if(command.equals("write")) {
			action = new WriteAction();
		} else if(command.equals("view")) {
			action = new ViewAction();
		} else if(command.equals("update_form")) {
			action = new UpdateFormAction();
		} else if(command.equals("update")) {
			action = new UpdateAction();
		} else if(command.equals("delete")) {
			action = new DeleteAction();
		}
		return action;
	}
}
