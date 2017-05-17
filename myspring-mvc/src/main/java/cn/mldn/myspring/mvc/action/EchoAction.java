package cn.mldn.myspring.mvc.action;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller

public class EchoAction {
	/*@RequestMapping("/echo")
	public ModelAndView echo(String msg){
		ModelAndView mav=new ModelAndView("/pages/echo.jsp") ;
		mav.addObject("echoMsg", "Echo"+msg) ;
		return mav ;
	}*/
	@RequestMapping("/echo")
	public String echo(String msg, HttpServletRequest request){
		request.setAttribute("echoMsg", "Echo"+msg) ;
		return "/pages/echo.jsp" ;
	}
	
}
