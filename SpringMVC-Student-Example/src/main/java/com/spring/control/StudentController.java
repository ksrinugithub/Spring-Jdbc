package com.spring.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/stu")
	public ModelAndView getStudentdata(Model model) {
		Student s = new Student("srinu", "HYD", 2222);
		model.addAttribute("name", s.getName());
		return new ModelAndView();

	}

}
