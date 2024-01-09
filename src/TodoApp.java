import java.time.LocalDate;
import java.util.ArrayList;

public interface TodoApp {

    // add a new task in todo
    Boolean createTask(String title, String description);

    // delete task from todo using id
    Task deleteTask(int id);

    // mark a task complete using id
    Task markComplete(int id);

    // search a task starting from word passed as param
    Task searchByWord(String keyword);

    // get all the task on a particular date
    ArrayList<Task> groupBy(LocalDate date);

    // return all the task currently present in todo
    void currentList();
}
