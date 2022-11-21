package com.rxpfarm.secureui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {

    @RequestMapping("/")
    public String loadHome(){
        return "Home";
    }

    @RequestMapping("/report")
    public String loadReport(Model m){
        return "Report";
    }
}
