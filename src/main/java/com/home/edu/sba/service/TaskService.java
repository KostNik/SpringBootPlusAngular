package com.home.edu.sba.service;

import com.home.edu.sba.domain.Task;


public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
