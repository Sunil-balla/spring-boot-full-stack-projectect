package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello";
	}
	

@RequestMapping("say-hello1")
	@ResponseBody
	public String sayHello1() {
		return "Hello1";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first html page title</title>");
		sb.append("</head>");
		sb.append("<body>My first html page</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody
	public String sayHelloJsp(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Name is " + name);
		return "sayHello";
	}
	
}
