package br.com.rlsystem.tasks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.rlsystem.tasks.services.TasksServices;

@Controller
@RequestMapping("/tasks")
public class TasksController {
	@Autowired
	TasksServices taskService;
	
	
	@RequestMapping(value =  "/listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		ModelAndView mv  = new ModelAndView();
		mv.addObject("tasks_list",taskService.allTasks());
		mv.setViewName("listar");
		
		return mv;
	}
	
	
}	
