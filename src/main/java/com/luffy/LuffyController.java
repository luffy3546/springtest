package com.luffy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LuffyController {
	
	@RequestMapping({"/", "/index"})
    public ModelAndView index() {
		System.out.println("hhs");
        return new ModelAndView("index");

    }

}
