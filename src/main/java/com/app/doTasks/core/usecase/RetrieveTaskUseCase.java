package com.app.doTasks.core.usecase;

import java.util.List;
import java.util.Optional;

import com.app.doTasks.core.domain.Task;

public interface RetrieveTaskUseCase {

	Optional<Task> retrieveById(Long id);
	
	List<Task> retrieveAll();
	
}
