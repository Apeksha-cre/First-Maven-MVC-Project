package com.telusko;

import com.telusko.services.SubtractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class Subcontroller 
{
	
	@RequestMapping("/sub")
	public ModelAndView sub(HttpServletRequest request, HttpServletResponse response)
	{
		int i= Integer.parseInt(request.getParameter("t1"));
		int j= Integer.parseInt(request.getParameter("t2"));
				SubtractService ss=new SubtractService();
		int k =ss.sub(i, j);

		
		ModelAndView mView= new ModelAndView();
		mView.setViewName("subdisplay.jsp");
		mView.addObject("result", k);
		
		return mView;
	}

}
