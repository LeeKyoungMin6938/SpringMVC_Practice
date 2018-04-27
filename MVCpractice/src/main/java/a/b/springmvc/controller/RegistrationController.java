package a.b.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import a.b.springmvc.model.User;
import a.b.springmvc.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userService;
	
	@RequestMapping(value= "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		//ModelAndView
		//응답할 View와 View에게 전달할 값을 저장하는 용도의 객체. 응답에 사용할 데이터와 페이지 정보 집합
		//컨트롤러의 처리 결과로써 응답에 사용할 데이터와 뷰에 대한 정보 집합.
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		return mav;
	}
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser (HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user")User user) {
		userService.register(user);
		
		return new ModelAndView("welcome","firstname",user.getFirstname());
	}
}
