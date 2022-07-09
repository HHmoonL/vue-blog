package com.lnw.vueblog.modules.controller;


import com.lnw.vueblog.common.ComResult;
import com.lnw.vueblog.modules.model.User;
import com.lnw.vueblog.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘 乃伟
 * @since 2022-07-09
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ComResult test(){
        User byId = userService.getById(1L);
        return ComResult.succ("200",byId);
    }



}

