package com.iu.control;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*") //앞에 qna 경로를 생략할수있다 해당 경로만 사용가능하다고 선언함.
public class QnaController {
	
	@RequestMapping(value="qnaList" , method={RequestMethod.GET , RequestMethod.POST}) //두가지 방식을 다 사용하고싶을때 {}로 감싼다
	public ModelAndView list(ModelAndView mv , @RequestParam(defaultValue="0" , required=false) int curPage){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWirter("iu");
		qnaDTO.setAge(29);
		mv.addObject("view", qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println("curPage:" +curPage);
		return mv;
	}
	@RequestMapping(value="qnaView")
	public String View(Model model){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWirter("iu");
		qnaDTO.setAge(29);
		model.addAttribute("view", qnaDTO).addAttribute("board", "QNA");
		
		return "/qna/qnaView";
	}

	@RequestMapping(value="qnaWrite" , method = RequestMethod.GET) //위에꺼와 동일하다 리턴타입이 void의 경우 value 값이 경로가 된다.)(경로와 리턴값이 동일하다면 )
	public void write(){
			
	}
	@RequestMapping(value="qnaWrite" , method = RequestMethod.POST) //위에꺼와 동일하다 리턴타입이 void의 경우 value 값이 경로가 된다.)(경로와 리턴값이 동일하다면 )
	public String write(QnaDTO qnaDTO , String title){
			//매개변수로 선언해주면 파라미터값이 없을시 오류가난다 400번 오류
		
		for(String s:qnaDTO.getName()){
			System.out.println(s);
		}  
		
		System.out.println("DTO;"+qnaDTO.getTitle());
		System.out.println("title:" +title);
		System.out.println(qnaDTO.getWirter());
		System.out.println(qnaDTO.getAge());
	
		return "redirect:./qnaList?curPage=5"; //post 방식의 인서트하면 리턴타입으로 경로를 지정해준다.
}
}