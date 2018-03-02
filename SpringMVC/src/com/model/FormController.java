package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping(value="/welcomeForm.html", method= RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView mv = new ModelAndView("WelcomePage");
		return mv;
	}
	
	@RequestMapping(value="/submitForm.html", method= RequestMethod.GET)
	public ModelAndView submitForm(@RequestParam(value="username") String uname, @RequestParam(value="password") String pass) {
		ModelAndView mv;
		if(pass.equals("rajesh")) {
		mv = new ModelAndView("SuccessPage");
		mv.addObject("msg", "Hello "+uname);
		return mv;
		}
		else
		{
			mv = new ModelAndView("WelcomePage");
			return mv;
		}
		
	}
}
