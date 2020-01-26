package kr.ac.hansung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Text;
import kr.ac.hansung.service.WriteService;

@Controller
public class WriteController {
	@Autowired
	private WriteService wrService;
	
	@RequestMapping("/writePost")
	public String writePost(Model model) {
		model.addAttribute("text",new Text());
		return "writePost";
	}
	
	@RequestMapping("/doPost")
	public String doPost(Text text) {
		String title = text.getTitle();
		String contents = text.getContents();
		
		wrService.doWrite(title, contents);
		return "home";
	}
}
