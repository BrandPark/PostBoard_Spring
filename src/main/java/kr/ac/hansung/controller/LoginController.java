package kr.ac.hansung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.User;
import kr.ac.hansung.service.JoinService;

@Controller
public class LoginController {
	@Autowired
	private JoinService jService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String  doLogin(@RequestParam(value="error", required=false)String error,
							@RequestParam(value="logout", required=false)String logout,
							Model model) {
		if(error != null) {
			model.addAttribute("errorMsg", "login_error");
		}
		if(logout != null) {
			model.addAttribute("logoutMsg", "logout_success");
		}
		return "login";
	}
	
	@RequestMapping("/join")
	public String showJoinPage(Model model, User user) {
		model.addAttribute("user",new User());
		return "join";
	}
	
	@RequestMapping(value="/doJoin", method=RequestMethod.POST)
	public String doJoin(Model model, User user) {
		String userId = user.getUserId();
		String userPassword = "{noop}"+user.getUserPassword();
		String userEmail = user.getUserEmail();
		
		jService.createUser(userId, userPassword, userEmail);
		
		return "joinSuccess";
	}
	
	
}
