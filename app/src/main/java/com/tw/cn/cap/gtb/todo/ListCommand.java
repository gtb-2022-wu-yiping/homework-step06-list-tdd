package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class ListCommand {
    final TaskRepository taskRepository = new TaskRepository();



    List<String> run() {
        //生成Task
        List<Task> tasks = taskRepository.loadTasks();
        //处理Task
        List<String> result = new ArrayList<>();
        result.addAll(Section.tbd().format(tasks));
        result.addAll(Section.completed().format(tasks));
        return result;
    }
}