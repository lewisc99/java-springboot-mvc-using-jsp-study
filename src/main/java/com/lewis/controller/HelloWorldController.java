package com.lewis.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld/helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld/helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request, Model model)
    {
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();
        String result = "YO!" + theName;

        model.addAttribute("message", result);

        return "helloworld/helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersioNThree(@RequestParam("studentName") String theName, Model model)
    {
        theName = theName.toUpperCase();

        String result = "Hey my friend from v3 " + theName;
        model.addAttribute("message",result);

        return "helloworld/helloworld";
    }
}
