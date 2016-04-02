package controllers;

import com.mu.Controller;

import helpers.SoyTemplate;

public class Test extends Controller {
	public void home() {
		renderHTML(SoyTemplate.render("test.helloWorld"));
	}
	
	public void json() {
		renderJSON("{\"hello\":\"world\"}");
	}
}