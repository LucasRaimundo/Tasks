package br.com.rlsystem.tasks.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.rlsystem.tasks.model.Tasks;



@Service
public class TasksServices {
	private static List<Tasks> tasksList = new ArrayList<Tasks>();
	static {
		tasksList.add(new Tasks(1, "limpar a casa", new Date(), false));
		tasksList.add(new Tasks(2, "limpar o carro", new Date(), false));
		tasksList.add(new Tasks(3, "matar a bianca", new Date(), false));
	}
	
	public List<Tasks>allTasks() {
		return tasksList;
	}
	
	public List<Tasks>allTasksByStatus(boolean status) {
		List<Tasks> tasksListByStatus = new ArrayList<Tasks>();
		
		for (Tasks task : tasksList) {
			if (task.getStatus() == status ) {
				tasksListByStatus.add(task);
			}
		}
		return tasksListByStatus;
	}
}
