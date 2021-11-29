package com.care.roote;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.roote.member.dto.MemberDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping("index")
	public String index() {
		return "re/index";
	}
	@RequestMapping("result")
	public String result(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		if(id.equals("abc")) {
			//model.addAttribute("result", "로그인 성공하였음!!");
			rs.addFlashAttribute("result","리다이렉트의 값 전달");
			
			MemberDTO dto = new MemberDTO();
			dto.setId(id);
			rs.addFlashAttribute("test",dto);
			
			return "redirect:rsOK";
		}else {
			return "redirect:rsNO";
		}
	}
	@RequestMapping("rsOK")
	public String rsOK() { //(@RequestParam String result){
		//System.out.println(result);
		return "re/rsOK";
	}
	@RequestMapping("rsNO")
	public String rsNO() {
		return "re/rsNO";
	}
}
