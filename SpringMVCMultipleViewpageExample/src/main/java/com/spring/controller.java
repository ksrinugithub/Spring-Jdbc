package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
@RequestMapping("/helo")
public String redirect() {
	return "viewpage";
	
}
@RequestMapping("/heello")
	public String once() {
		return "final";
	
}
}
