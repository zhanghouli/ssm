package com.cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.entity.PrintField;
import com.cn.service.IPrintFieldService;

@Controller
@RequestMapping(value = "/printfield")
public class PrintFieldController {

	//@Resource
	@Autowired
	IPrintFieldService printFieldService;
	
	
	@RequestMapping(value = "/list")  
    public ModelAndView list()  
    {  
        ModelAndView mv=new ModelAndView();  
        List<PrintField>  userList = printFieldService.getUser();  
        mv.addObject("userList",userList);  
        mv.setViewName("/show");  
        return mv;  
    }  
	
	
}
