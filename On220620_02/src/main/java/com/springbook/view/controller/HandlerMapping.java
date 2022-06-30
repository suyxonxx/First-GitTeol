package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.user.LoginController;
import com.springbook.view.board.*;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
//	Map<key type, value type> / m.put(key, value) / m.get(key) => get value
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
