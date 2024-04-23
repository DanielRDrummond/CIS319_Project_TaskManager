/**
 * Your name: Daniel Drummond
 * Date: 04/21/2024
 * Assignment CIS319 Project - Task Manager App
 * Description: This class manages a list of tasks and provides methods for adding, removing, updating, and retrieving tasks.
 */

 import java.util.ArrayList;

 public class TaskManager {
     private ArrayList<Task> tasks;
 
     public TaskManager() {
         this.tasks = new ArrayList<>();
     }
 
     public void addTask(Task task) {
         tasks.add(task);
     }
 
     public void removeTask(Task task) {
         tasks.remove(task);
     }
 
     public void updateTask(Task task) {
         // Implement update logic here
     }
 
     public ArrayList<Task> getTaskByStatus(Status status) {
         ArrayList<Task> tasksWithStatus = new ArrayList<>();
         for (Task task : tasks) {
             if (task.getStatus() == status) {
                 tasksWithStatus.add(task);
             }
         }
         return tasksWithStatus;
     }
 
     public void displayTasks() {
         for (Task task : tasks) {
             System.out.println(task);
         }
     }
 }
 