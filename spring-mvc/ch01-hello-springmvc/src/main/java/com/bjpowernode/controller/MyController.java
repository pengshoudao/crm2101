package com.bjpowernode.controller;


import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value={"/some.do","/first.do"})
    public ModelAndView receiveParam(Student myStudent,String sex){
        //System.out.println("receiveParam, name="+myStudent.getName()+"age"+myStudent.getAge());
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname","abc");
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("mystudent",myStudent);
        mv.addObject("mysex",sex);

        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        //mv.setViewName("other");
        return mv;

    }

    @RequestMapping(value={"/other.do","/second.do"})
    public ModelAndView receiveParam1(Student myStudent,String sex){
       // System.out.println("receiveParam, name="+myStudent.getName()+"age"+myStudent.getAge());
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname","def");
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("mystudent",myStudent);
        mv.addObject("mysex",sex);

        //mv.setViewName("/WEB-INF/view/show.jsp");
        //mv.setViewName("show");
        mv.setViewName("other");
        return mv;

    }

}
