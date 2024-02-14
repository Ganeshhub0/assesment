package com.example.asses3.controller;

import com.example.asses3.entities.Coverage;
import com.example.asses3.entities.Policy;
import com.example.asses3.entities.State;
import com.example.asses3.services.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class PolicyController {
    @Autowired
    PolicyServiceImpl policyService;


    @GetMapping("demo")
    public String demo() {
        return "demo";
    }

    @GetMapping("insert")
    public String insert(Model model) {
        model.addAttribute("policy", new Policy());
        model.addAttribute("coverage", policyService.findcoverage());
        model.addAttribute("state", policyService.findstate());
        return "add-policy";
    }

    @PostMapping("submit")
    public String submit(@ModelAttribute("policy") Policy p, @RequestParam("coverage") String coverage[], @RequestParam("state") String states[], Model model) {
        for (String s : states) {
            int stateid = Integer.parseInt(s);
            State state1 = policyService.findstateid(stateid);
            p.getStateList().add(state1);
        }
        for (String cover : coverage) {
            int coverageid = Integer.parseInt(cover);
            Coverage c = policyService.findcoveragebtid(coverageid);
            p.getCoverageList().add(c);
        }
        policyService.insert(p);
        return "premier";
    }


    @GetMapping("list")
    public String list(Model model) {
        List<Policy> policies = policyService.findall();
        model.addAttribute("list", policies);
        return "list";
    }

    @GetMapping("premium")
    public String rate(){
        return null;
    }
}

