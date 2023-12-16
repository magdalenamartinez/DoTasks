package com.app.doTasks.core.usecase;

import com.app.doTasks.core.domain.Task;

public interface DeleteTaskUseCase {
	boolean deleteTask(Long id);
}
