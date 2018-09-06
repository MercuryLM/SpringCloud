package com.school.controller;

import com.school.dao.IUserDao;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.service.IUserService;
import com.school.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller
@RequestMapping("/user")
public class UserController {
		
	 @Resource
	    private IUserService userService;

	   
	   @RequestMapping("/show")
	   public String selectU(HttpServletRequest request){
		   int userId = Integer.parseInt(request.getParameter("id"));    
           User user = this.userService.getUserById(userId); 
           System.out.println(user.toString());
		   return user.toString();
	   }
	   
	   @RequestMapping("/showUser")    
       public String toIndex(HttpServletRequest request,Model model){    
           int userId = Integer.parseInt(request.getParameter("id"));    
           User user = this.userService.getUserById(userId);    
           model.addAttribute("user", user);    
           return "showUser";    
       }  
	   

	 


}