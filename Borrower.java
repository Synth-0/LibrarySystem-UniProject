import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Borrower {
    private String name;
    private int id;
    private String job;
    public static List<Borrower> br = new ArrayList<Borrower>();

    public Borrower(String job, String name, int id) {

        this.name = name;
        this.id = id;
        this.job = job;
        br.add(this);

    }


    public void printArr() {
        for (Borrower borrow : br) {
            System.out.println(borrow.toString());
        }
    }

    public String toString() {
        return "Name: " + getName() + "\nID: " + getId() + "\nJob: " + getJob();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public static void borrow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your job(student, staff, faculty): ");
        String job = sc.nextLine();
        System.out.println();
        App.borrow = BorrowerFactory.createBorrower(job, name, id);
        System.out.println("Enter the item you want to borrow(book, technical paper, video, journal): ");
        String item = sc.nextLine();
        if (item.equals("book")) {
            App.book.printArr();

            System.out.println("Enter the id of the book you want to borrow: ");
            int bookId = sc.nextInt();
            App.lend.add(App.lended = lendedRecordFactory.createLendedRecords(name, id, bookId, item, job));

        } else if (item.equals("technical paper")) {
            App.technicalPaper.printArr();
            System.out.println("Enter the id of the technical paper you want to borrow: ");
            int technicalPaperId = sc.nextInt();
            App.lend.add(App.lended = lendedRecordFactory.createLendedRecords(name, id, technicalPaperId, item, job));
        } else if (item.equals("video")) {
            App.video.printArr();
            System.out.println("Enter the id of the video you want to borrow: ");
            int videoId = sc.nextInt();
            App.lend.add(App.lended = lendedRecordFactory.createLendedRecords(name, id, videoId, item, job));
        } else if (item.equals("journal")) {
            App.journal.printArr();
            System.out.println("Enter the id of the journal you want to borrow: ");
            int journalId = sc.nextInt();
            App.lend.add(App.lended = lendedRecordFactory.createLendedRecords(name, id, journalId, item, job));
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("you registered successfully");
    }

}
