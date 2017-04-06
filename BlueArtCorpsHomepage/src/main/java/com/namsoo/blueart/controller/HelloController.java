package com.namsoo.blueart.controller;

import com.namsoo.blueart.dao.IDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Namsoo on 2017. 4. 4..
 */
@Controller
public class HelloController {

    //use mybatis

    @Autowired
    private SqlSession sqlSession;




    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("111JJANG");
        IDao dao = sqlSession.getMapper(IDao.class);
        System.out.println("22222");
        model.addAttribute("listUser", dao.userList());

        System.out.print("민수짱");
        return "index";
    }
}
