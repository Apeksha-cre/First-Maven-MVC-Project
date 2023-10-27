package com.telusko;

import com.telusko.services.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Addcontroller
{
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		int i= Integer.parseInt(request.getParameter("t1"));
		int j= Integer.parseInt(request.getParameter("t2"));
		
		AddService ac=new AddService();
		int k =ac.add(i, j);
		
		ModelAndView mView= new ModelAndView();
		mView.setViewName("adddisplay.jsp");
		mView.addObject("result", k);
		
		return mView;
	}
	
	



	
	
	
	
	
	
	
	

}
