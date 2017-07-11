package com.rahul.Controller;

import com.rahul.Entity.Student;
import com.rahul.Entity.User;
import com.rahul.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rahul on 11/7/17.
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public User getAllStudents(
            @RequestParam int id
    ){
        return userService.getUserById(id);
    }
}
