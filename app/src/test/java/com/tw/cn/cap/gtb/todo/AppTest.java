
package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
class AppTest {
    @Test
    void should_list_existing_tasks() {
        List<String> result = new App().run();
        Assertions.assertEquals(List.of(
                "# TO be done",
                "task01",
                "task02"),
                result);
    }
}
