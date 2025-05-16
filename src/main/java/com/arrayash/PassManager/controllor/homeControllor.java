package com.arrayash.PassManager.controllor;

import com.arrayash.PassManager.model.data;
import com.arrayash.PassManager.service.passService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Optional;


@Controller
public class homeControllor {
   


    @Autowired
    passService passervice;

    @GetMapping("/")
    public String viewhomepage(Model model){
model.addAttribute("passlist",passervice.GetALlPass());
        return "home";

    }
    @GetMapping("/addnew")
    public String createpass( Model model ){
        data dt= new data();
        model.addAttribute("dt", dt);
        return "create";
    }
    @PostMapping("/save")
    public String updatepass(@ModelAttribute("dt") data dt ){
        passervice.updatepass(dt);
        return "redirect:/";
    }

    @GetMapping("/passupdateform/{passid}")
    public String updatepassform(@PathVariable(value="passid") Long passid , Model model ){
        Optional<data> dt= passervice.getbyname(passid);
        model.addAttribute("dt", dt);
        return "update";
    }
    @GetMapping("/deletepass/{passid}")
    public String deletepass(@PathVariable("passid") long passid ){
        passervice.deletepass(passid);
        return "redirect:/";
    }


}
