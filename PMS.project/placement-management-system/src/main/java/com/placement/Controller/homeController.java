package com.placement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class homeController
{
	@RequestMapping("/home")
	public String home(Model model)
	
	{
		model.addAttribute("title","Home -placementmanagementsystem ");
		return "home";
	}	
	
	@RequestMapping("/about")
	public String about(Model model)
	
	{
		model.addAttribute("title","About -placementmanagementsystem ");
		return "about";
	}	
	@RequestMapping("/signup")
	public String signup(Model model)
	
	{
		model.addAttribute("title","Register -placementmanagementsystem ");
		return "signup";
	}	
}