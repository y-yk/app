package springboots.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controller1 {

    @RequestMapping("/hello")
    public String test01(HttpServletRequest request){
        request.setAttribute("name","于元凯");
        //request.setAttribute("","");
        return "test";
    }

    @RequestMapping("/backendlogin")
    public String test02(HttpServletRequest request){

        return "backendlogin";
    }

}
