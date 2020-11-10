package com.hr.controller;

import com.hr.entity.User;
import com.hr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName：UserController
 * @Description：TODO
 * @Author：HuangZhen
 * @Date 2020/11/10 17:19
 * @Versopn：1.0
 */

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public String findAll(ModelMap map){

        map.addAttribute("Ulist",userService.findAll());

        return "query";
    }

    @RequestMapping("deleteById")
    public String deleteById(int id){

        int result = userService.deleteById(id);
        if( result > 0 ){
            System.out.println("删除成功！");
        }

        return "redirect:findAll";
    }

    @RequestMapping("findById")
    public String findById(int id,ModelMap map){

        User u = userService.findById(id);
        System.out.println(u);
        map.addAttribute("u",u);

        return "update";
    }

    @RequestMapping("update")
    public String update(User u){

        int update = userService.update(u);

        if( update > 0 ){
            System.out.println("修改成功！");
        }

        return "redirect:findAll";
    }

    @RequestMapping("insert")
    public String insert(User u){

        System.out.println(u);
        int insert = userService.insert(u);

        if( insert > 0 ){
            System.out.println("添加成功！");
        }

        return "redirect:findAll";
    }

}
