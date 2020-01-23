package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WriteController {
	
	@RequestMapping("/writePost")
	public String writePost() {
		return "writePost";
	}
}
