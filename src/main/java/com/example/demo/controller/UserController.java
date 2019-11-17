package com.example.demo.controller;



import com.example.demo.dao.pojo.TUser;
import com.example.demo.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xuyiming
 * @description
 * @date 2019-11-04 23:08
 */


@RestController
@RequestMapping("/get")
public class UserController {

    @Autowired
    UserManager userManager;

    @RequestMapping(value = "/user",method= RequestMethod.GET)
    @ResponseBody
    public String getUser(@RequestParam("id") Integer id){
        TUser tUser = userManager.selectUserById(id);
        return tUser.toString();

    }

    @RequestMapping(value = "/insert",method= RequestMethod.POST)
    @ResponseBody
    public int createUser(@RequestBody TUser tUser){
        int i = userManager.insertUser(tUser);
        return i;
    }

    @RequestMapping(value = "/selectByage",method= RequestMethod.GET)
    @ResponseBody
    public String selectUser(@RequestParam("age") int age){
        List<TUser> users = userManager.selectByage(age);
        return users.toString();
    }

}
