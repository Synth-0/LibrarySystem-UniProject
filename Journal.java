import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Journal implements Item {
    private String title;
    private int id;
    private String description;    
    private static int fee = 3;
    public static ArrayList<Journal> journal = new ArrayList<Journal>();

    public Journal(String titleString, int id, String description) {

        journal.add(this);

    }

    public void printArr() {
        for (Journal j : journal) {
            System.out.println(j.toString());
        }
    }

    

    public String toString() {
        return "Title: " + getName() + ", ID: " + getId()+" , Description: "+getDescription();
    }
    

    public String getName() {
        return this.title;
    }

    public void setName(String name) {
        this.title = name;
    }

    @Override
    public int getId() {
    return id;
    }

    

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        
        this.description = description;
    }
}