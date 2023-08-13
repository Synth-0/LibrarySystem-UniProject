import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements Item {
    private String title;
    private int id;
    private String description;
    private static int fee = 3;
    public static List<Book> books = new ArrayList<Book>();

    public Book(String titleString, int id, String description) {

        books.add(this);

    }
    @Override
    public void setDescription(String description) {
        
        this.description = description;
    }

    public void printArr() {
        for (Book book : books) {
            System.out.println(book.toString());
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
    
}
