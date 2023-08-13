import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Video implements Item {
    private String title;
    private int id;
    private String description;
    private static int fee = 1;
    public static List<Video> vid = new ArrayList<Video>();

    public Video(String titleString, int id, String description) {

        vid.add(this);

    }

    public void printArr() {
        for (Video v : vid) {
            System.out.println(v.toString());
        }
    }


    
    public String toString() {
        return "Title: " + getName() + ", ID: " + getId()+" , Description: "+getDescription();
    }
    @Override
    public void setDescription(String description) {
        
        this.description = description;
    }

    public String getName() {
        return this.title;
    }

    public void setName(String name) {
        this.title = name;
    }

    @Override
    public int getId() {
        return this.id;
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
        return this.description;
    }
}
