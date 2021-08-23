package duke;

import java.util.Scanner;

public class Ui {
    private Scanner sc;

    public Ui() {
        sc = new Scanner(System.in);
    };

    public void addUi(TaskList taskList, TaskList.Task task) {
        System.out.println("Got it. I've added this task:\n" + "  " + task + "\n" +
                "Now you have " + taskList.size() + " tasks in the list.");
    }

    public void doneUi(TaskList.Task task) {
        if (task != null) {
            System.out.println("Nice! I've marked this task as done:\n  " + task);
        }
    }

    public void deleteUi(TaskList taskList, TaskList.Task task) {
        System.out.println("Noted. I've removed this task:\n  " + task + "\nNow you have "
                + taskList.size() + " tasks in the list.");
    }

    public void listUi(TaskList taskList) {
        if (taskList.isEmpty()) {
            System.out.println("You do not have any outstanding task. Yay!");
        } else {
            System.out.println("Here are the tasks in your list:\n" + taskList.toString());
        }
    }

    public void exitUi() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void unknownUi() {
        System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
    }

    public void greet1() {
        System.out.println("Hello! I'm Duke\nWhat can I do for you?");
    }

    public void greet2() {
        System.out.println("Welcome back! :-)");
    }

    public void showLine() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public String readCommand() {
        return sc.nextLine();
    }
}