package ru.kpfu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.model.User;

/**
 * Created by Andrey on 05.06.2017.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String getIndexPage(Model model){
        model.addAttribute("user", new User());
        doSomething();
        return "index";
    }
    public void doSomething(){
        System.out.println("someth");
    }

}
