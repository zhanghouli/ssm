package com.cn.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.service.ITestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Resource  
    private ITestService testService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        Map<String,Object> map = this.testService.getUserById(userId);  
        model.addAttribute("user", map);  
        return "showUser";  
    }

}
