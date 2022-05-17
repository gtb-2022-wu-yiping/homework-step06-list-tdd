package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {
    @Test
    void should_parse_completed_property_for_task() {
        Boolean isCompleted = TaskFactory.createTask(1,"+ foobar").isCompleted();
        Assertions.assertFalse(isCompleted);
    }
}