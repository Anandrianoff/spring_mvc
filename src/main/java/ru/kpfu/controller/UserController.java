package ru.kpfu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.model.User;
import ru.kpfu.repository.PostsRepository;
import ru.kpfu.repository.UserRepository;
import ru.kpfu.util.UserValidator;

/**
 * Created by Andrey on 05.06.2017.
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserValidator validator;
    @Autowired
    UserRepository r;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNew(@ModelAttribute User user, BindingResult result){
        validator.validate(user, result);
        if(result.hasErrors()){
            System.out.println("Все очень плоха");
        }else {
            r.save(user);
        }
        return "index";
    }



}
