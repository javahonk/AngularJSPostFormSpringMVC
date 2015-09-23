package com.javahonk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringMVCController {
	
	@RequestMapping(value = "/PostFormData", method = RequestMethod.POST)
	public @ResponseBody Person PostService(@RequestBody Person person) {
		
		return person;
	}
	
	@RequestMapping(value = "/PostFormDataByParam", method = RequestMethod.POST)
	public @ResponseBody Person PostFormDataByParam(HttpServletRequest request) {
		
		Person person = new Person();
		person.setName(request.getParameter("name"));
		person.setName(request.getParameter("location"));
		person.setName(request.getParameter("phone"));
		return person;
	}

}
