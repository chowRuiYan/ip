package duke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TaskListTest {
    @Test
    public void taskListConstructor_emptyString_DukeExceptionThrown() {
        try {
            TaskList taskList = new TaskList("");
            fail();
        } catch (DukeException e) {
            assertEquals("No previous data found.\nLet's start a new To-Do List!", e.getMessage());
        }
    }

    @Test
    public void size_emptyTaskList_success() {
        TaskList taskList = new TaskList();
        assertEquals(0, taskList.size());
    }

    @Test
    public void isEmpty_emptyTaskList_success() {
        TaskList taskList = new TaskList();
        assertEquals(true, taskList.isEmpty());
    }
}
