package com.namsoo.blueart.controller;

import com.namsoo.blueart.dao.IDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Namsoo on 2017. 4. 4..
 */
@Controller
public class HelloController {

    //use mybatis

    @Autowired
    private SqlSession sqlSession;




    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {

        IDao dao = sqlSession.getMapper(IDao.class);
        model.addAttribute("listUser", dao.userList());


        //시간을 넣어준다
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate );



        System.out.print("민수짱");
        return "index";
    }


    @RequestMapping("/delete")
    public String delete(HttpServletRequest request, Model model) {
        //dao.deleteDao(request.getParameter("mId"));
        return "redirect:list";
    }
}
