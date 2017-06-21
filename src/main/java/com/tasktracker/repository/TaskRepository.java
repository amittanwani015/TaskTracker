package com.tasktracker.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import com.tasktracker.database.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Serializable> {

	
	
	
	
}
