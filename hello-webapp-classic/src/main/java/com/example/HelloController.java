package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/")
    public ModelAndView greetings(HttpServletRequest request) {
        return new ModelAndView("greetings", "name", ServletRequestUtils.getStringParameter(request, "name", "world"));
    }
}
