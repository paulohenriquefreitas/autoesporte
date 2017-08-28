package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.AutoesporteService;

@Controller
@RequestMapping("/autoesporte")
public class AutoesporteController {
      
	    @Autowired
	    private AutoesporteService autoesporteService;
				
		@RequestMapping("/page")	
		public String list(Model model){
			
			model.addAttribute("autoesporte", autoesporteService.find());		

			return "autoesporte";
			
		}
	}

