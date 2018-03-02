package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"studentHobby"});
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	@RequestMapping(value="/getAdmission.html", method=RequestMethod.GET)
	public ModelAndView getAdmission() {
		ModelAndView mv = new ModelAndView("AdmissionPage");
		return mv;
	}
	
	/*@RequestMapping(value="/submitAdmission.html", method=RequestMethod.GET)
	public ModelAndView submitAdmission(@RequestParam("name") String name,@RequestParam("hobby") String hobby) {
		
		Student s = new Student();
		s.setStudentName(name);
		s.setStudentHobby(hobby);
		ModelAndView mv = new ModelAndView("AdmissionSuccessPage");
		mv.addObject("headermsg","Welcome to My admission process");
		mv.addObject("student1", s);
		return mv;
	}*/

	@ModelAttribute	
	public void addCommon(Model m1) {
		m1.addAttribute("headermsg","Welcome to my admission");
	}
	@RequestMapping(value="/submitAdmission.html", method=RequestMethod.POST)
	public ModelAndView submitAdmission(@ModelAttribute("student1") Student student1, BindingResult result) {
		
		if(result.hasErrors())
		{
			ModelAndView mv = new ModelAndView("AdmissionPage");
			return mv;
		}
		
		ModelAndView mv = new ModelAndView("AdmissionSuccessPage");
		
		
		return mv;
	}
}
