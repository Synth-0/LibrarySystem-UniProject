import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalPaper implements Item {
    private String title;
    private int id;
   private String description;
    private static int fee = 2;
    public static List<TechnicalPaper> tc = new ArrayList<TechnicalPaper>();

    public TechnicalPaper(String titleString, int id, String description) {

        tc.add(this);

    }

    @Override
    public void setDescription(String description) {
        
        this.description = description;
    }

    public void printArr() {
        for (TechnicalPaper tech : tc) {
            System.out.println(tech.toString());
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
    public  LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String getDescription() {
        return description;
    }
}