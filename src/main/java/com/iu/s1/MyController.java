package com.iu.s1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //이클래스는 컨트롤러 역활을 합니다. 표시
public class MyController {
	
	@RequestMapping(value="/notice/noticeList")
	public String go(HttpServletRequest request){
		
		String name = request.getParameter("name");
		System.out.println("name:" +name);
		return "notice/noticeList";
		
	}
	
	@RequestMapping(value="/notice/noticeView")
	public String View(){
		
		
		return "notice/noticeView";
	}

}
