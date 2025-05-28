package com.in28minutes.springboot.myfirstwebapp.login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goToWelcomePage(ModelMap model) {
		model.put("name", "sunil");
		return "welcome";
	}		
}

/*
 * 
 * @RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name,
			@RequestParam String password, ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		} else {
			model.put("errorMessage", "Invalid Credentials! Try again");
			return "login";
		}
	}

 * 
 * */


/*


	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login.jsp
	


 * 	//@ResponseBody
 * 
		logger.debug("Request param is {}", name);
		logger.info("I want this printed at info level");
		logger.warn("I want this printed at warn level");
		System.out.println("Name is: " + name);
 * */