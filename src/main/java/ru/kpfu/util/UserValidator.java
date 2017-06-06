package ru.kpfu.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.model.User;

/**
 * Created by Andrey on 05.06.2017.
 */
@Component
public class UserValidator implements Validator {

    //регистрация классов, поддерживающих валидацию
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        User u = (User)o;
        if(u.getName() == null || u.getName().equals("")){
            errors.rejectValue("name", "", "Not empty");
        }
    }
}
