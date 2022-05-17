package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private final String title;
    private final boolean flag;

    public Section(String title, boolean flag) {
        this.title = title;
        this.flag = flag;
    }

    static Section tbd() {
        return new Section("# To be done", false);
    }

    static Section completed() {
        return new Section("# Completed", true);
    }

    List<String> format(List<Task> tasks) {
        final List<String> result = new ArrayList<>();
        result.add(title);
        tasks.stream().filter(this::isTypeMatch).map(Task::format).forEach(result::add);
        if (result.size() == 1){
            result.add("Empty");
        }
        return result;
    }

    private boolean isTypeMatch(Task task) {
        return flag == task.isCompleted();
    }
}
