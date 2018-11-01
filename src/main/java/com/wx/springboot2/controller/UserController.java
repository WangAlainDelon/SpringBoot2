package com.wx.springboot2.controller;


import com.wx.springboot2.dao.UserDao;
import com.wx.springboot2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    /*
        测试JPA
     */
    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "/userentity",method = RequestMethod.GET)
    public List<User> show()
    {

        return userDao.findAll();
    }

    @RequestMapping(value = "/userentity/{id}")
    public User show2(@PathVariable int id)
    {
        User one = userDao.getOne(id);
        return one;
    }
}
