package com.telusko;

import com.telusko.services.MulSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MulController {

        @RequestMapping("/mul")
        public ModelAndView mul(HttpServletRequest request, HttpServletResponse response) {
            int i = Integer.parseInt(request.getParameter("t1"));
            int j = Integer.parseInt(request.getParameter("t2"));
            MulSevice ms = new MulSevice();
            int k = ms.mul(i, j);


            ModelAndView mView = new ModelAndView();
            mView.setViewName("multidisplay.jsp");
            mView.addObject("result", k);

            return mView;
        }
}
