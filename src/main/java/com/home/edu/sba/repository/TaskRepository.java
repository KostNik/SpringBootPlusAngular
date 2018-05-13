package com.home.edu.sba.repository;

import com.home.edu.sba.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
