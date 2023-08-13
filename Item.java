import java.time.LocalDate;

interface Item {
    public int getId();
    public int getFee();

    public void setId(int id);

    public String getDescription();
    public void setDescription(String description);

    public String toString();
    public String getName();
    public void setName(String name);

    public void printArr();
    public LocalDate getCurrentDate() ;

}
