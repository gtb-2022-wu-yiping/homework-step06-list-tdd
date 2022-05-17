
package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class App {

    private final TaskRepository taskRepository = new TaskRepository();

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        //生成Task
        List<Task> tasks = taskRepository.loadTasks();
        //处理Task
        List<String> result = new ArrayList<>();
        result.add("# To be done");
        for (Task task : tasks) {
            result.add(task.format());
        }
        return result;
    }

}
