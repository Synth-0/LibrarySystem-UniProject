import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LendedRecord {
    private String borrowerName;
    private int borrowerId;
    private int itemid;
    private String itemTitle;
    private String borrowerJob;
    private LocalDate lendedDate;
    private LocalDate returnedDate;
    public List<LendedRecord> lr = new ArrayList<LendedRecord>();


    public LendedRecord(String borrowerName, int borrowerId, int itemid, String itemTitle, String borrowerJob) {
        this.borrowerName = borrowerName;
        this.borrowerId = borrowerId;
        this.itemid = itemid;
        this.itemTitle = itemTitle;
        this.borrowerJob = borrowerJob;
        lendedDate = getCurrentDate();
        returnedDate = null;
        lr.add(this);

    }

    public String toString() {
        return "name of borrowers: " + getName() + ", ID: " + getId() + ", Item ID: " + getItemId() + ", Item Title: "
                + getItemTitle() + ", Job: " + getJob() + ", Lend Date: " + gBDate();
    }

    public String getName() {
        return this.borrowerName;
    }

    public int getId() {
        return this.borrowerId;
    }

    public int getItemId() {
        return this.itemid;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public String getJob() {
        return this.borrowerJob;
    }

    public void printArr() {
        for (LendedRecord lended : lr) {
            System.out.println(lended.toString());
        }
    }
    public LocalDate gBDate(){
        return lendedDate;
    }
    public LocalDate gRDate(){
        return returnedDate;
    }
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
   

}