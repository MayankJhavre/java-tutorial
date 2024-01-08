import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class TodoApp {
    ArrayList<Task> taskList = new ArrayList<>();

    // create task method
    public Boolean createTask(String title, String description) {
        LocalDate date = LocalDate.now();
        Task newTask = new Task(title, description, date);
        taskList.add(newTask);
        return true;
    }

    // delete task method
    public Task deleteTask(int id) {
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).id == id) {
                Task task = taskList.get(i);
                taskList.remove(i);
                return task;
            }
        }
        return null;
    }

    // status update of task
    public Task markComplete(int id) {
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).id == id) {
                taskList.get(i).status = true;
                return taskList.get(i);
            }
        }
        return null;
    }

    // beginning keyword based search
    public Task searchByWord(String keyword) {
        for (Task task : taskList) {
            if (task.title.toLowerCase().startsWith(keyword.toLowerCase())) {
                return task;
            }
        }
        return null;
    }

    // get all the task on date passed as parameter
    public ArrayList<Task> groupBy(LocalDate date){
        ArrayList<Task> groupedList = new ArrayList<>();
        for (Task task : taskList){
            if(task.date.equals(date)){
                groupedList.add(task);
            }
        }
        return groupedList;
    }

    public void currentList(){
        System.out.println("Current task list: ");
        for(Task task : taskList){
            System.out.println(task.id + " " + task.title + " " + task.description + " " + task.status + " " + task.date);
        }
        System.out.println("----------------------------");
    }
}
