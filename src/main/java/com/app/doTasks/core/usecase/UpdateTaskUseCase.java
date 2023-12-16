package com.app.doTasks.core.usecase;

import java.util.Optional;

import com.app.doTasks.core.domain.Task;

public interface UpdateTaskUseCase {
	Optional<Task> updateTask(Long id);
}
