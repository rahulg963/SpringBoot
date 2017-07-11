package com.rahul.Service;

import com.rahul.Dao.UserDao;
import com.rahul.Entity.Student;
import com.rahul.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rahul on 11/7/17.
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
