/**
 * Your name: Daniel Drummond
 * Date: 04/21/2024
 * Assignment CIS319 Project - Task Manager App
 * Description: This class contains the main method to demonstrate the usage of the TaskManager class.
 */

 import java.util.ArrayList;
 
 public class App {
    public static void main(String[] args) {
        // Example usage of the classes
        User user = new User("John Doe", "john.doe@example.com");
        Task task1 = new Task("Complete project", "Finish the project by end of week", "2024-04-15", Priority.HIGH, Status.IN_PROGRESS);
        Task task2 = new Task("Buy groceries", "Buy essentials from the supermarket", "2024-04-12", Priority.MEDIUM, Status.PENDING);

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Display tasks
        taskManager.displayTasks();
    }
}
