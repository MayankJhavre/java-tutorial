import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        app.createTask("Task 1", "this and that");
        app.createTask("Task 2", "here n there");
        app.createTask("Task 3", "Something Something");
        app.createTask("Task 4", "uooga booga");
        app.createTask("Task 5", "out of work");

        LocalDate date1 = LocalDate.of(2024, 01, 06);

        // get by date
        ArrayList<Task> sortByDate = app.groupBy(date1);

        for(Task task : sortByDate){
            task.printTask();
        }

        app.currentList();

        // update
        Task updatedTask = app.markComplete(1);
        System.out.println("Updated task: ");
        updatedTask.printTask();
        System.out.println("----------------------------");

        app.currentList();

        // delete
        Task deletedTask = app.deleteTask(2);
        System.out.println("Deleted task: ");
        deletedTask.printTask();
        System.out.println("----------------------------");


        app.currentList();

        Task searchedTask = app.searchByWord("task 2"); // case insensitive
        if(searchedTask != null){
            System.out.println("Searched Task: ");
            searchedTask.printTask();
            System.out.println("----------------------------");
        }

        return;
    }
}