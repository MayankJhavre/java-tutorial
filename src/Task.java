import java.time.LocalDate;

public class Task {
    public static int uuid = 0;
    int id;
    String title;
    String description;
    LocalDate date;

    Boolean status;

    public Task(String title, String description, LocalDate date){
        this.id = uuid++;
        this.title = title;
        this.description = description;
        this.date = date;
        this.status = false;
    }

    public void printTask(){
        System.out.println(" "  + this.id + " " + this.title + " " + this.description + " " + this.status + " " + this.date);
        return;
    }

}
