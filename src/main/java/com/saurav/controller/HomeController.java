package com.saurav.controller;

import com.saurav.dao.StudentDao;
import com.saurav.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class HomeController
{   @Autowired
    StudentDao studentDao;

    @RequestMapping("/hi")
    public String m1()
    {
        return "test";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg(Model model)
    {
        model.addAttribute("data",new Student());
        return "reg";
    }


    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("data")Student student,Model model)
    {
         int a=studentDao.save(student);
         model.addAttribute("a",a);
        return "test";
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Student> getAllStudentsRecord(Model model)
    {

        return studentDao.getAll();
    }



}
