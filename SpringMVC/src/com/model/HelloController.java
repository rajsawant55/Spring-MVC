package com.model;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/greet")
public class HelloController{


	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("WelcomePage");
		mv.addObject("Message","Hello Rajesh welcome to Sping mvc");
		
		return mv;
	}
	
	@RequestMapping("/hi/{username}/{country}")
	public ModelAndView hiWorld(@PathVariable Map<String,String> pathvar){
		// TODO Auto-generated method stub
		String name = pathvar.get("username");
		String country = pathvar.get("country");
		ModelAndView mv = new ModelAndView("WelcomePage");
		mv.addObject("Message","Hi "+name +" welcome to Sping mvc. And i am from "+ country);
		
		return mv;
	}
	
}
