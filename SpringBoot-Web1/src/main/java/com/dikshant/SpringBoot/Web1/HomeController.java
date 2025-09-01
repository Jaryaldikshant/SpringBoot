package com.dikshant.SpringBoot.Web1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

//    @RequestMapping("/calculate")
//    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//
//        int sum = num1+num2;
//
//        mv.addObject("sum",sum);
//        mv.setViewName("result");
//        return mv;
////        mv.addAttribute("sum",sum);
////        return "result";
//    }

    @RequestMapping("addProgrammer")
    public String addProgrammer(@ModelAttribute("programmer1") Programmer programmer){

//        Programmer programmer = new Programmer();
//
//        programmer.setAid(aid);
//        programmer.setA_name(a_name);

//        mv.addObject("programmer",programmer);
//        mv.setViewName("result");

        return "result";
//        mv.addAttribute("sum",sum);
//        return "result";
    }
}
