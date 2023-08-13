//this assignment is made by Zheer Raoof Muhammad Ali (ID: 1900335)
// and Helin Muhammad Amin Raoof (ID: 1800070)
//design patterns we used in this project are: factory method, mediator, get and set, singleton-hybrid, 
// source for mediator design pattern: https://refactoring.guru/design-patterns/mediator 
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static Item book;
    public static Item journal;
    public static Item technicalPaper;
    public static Item video;
    public static Borrower borrow;
    public static LendedRecord lended;
    
    public static List<LendedRecord> lend = new ArrayList<LendedRecord>();

    //App app;    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printBooks();        
        printJournal();
        printTechnicalPapers();
        printVideo();

        while (true) {
            mainMenu();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                TaskMediator.BorrowTask();
            } else if (choice == 2) {
                TaskMediator.ReturnTask();
            } else if (choice == 3) {
                printBorrowedItems();
            } else if (choice == 4) {
                System.out.println("goodbye :)");
                break;
            }
        }

    }

    static void printBorrowedItems() {
        for (LendedRecord lended : lend) {
            System.out.println(lended.toString());
        }
    }

    static void mainMenu() {
        System.out.println("1.borrow\n2.return item\n3.print borrowed items\n4.exit");
    }

    static void printBooks() {
        book = ItemFactory.createBook("The Great Gatsby", 1, "The Great Gatsby is a 1925 novel by American writer F. Scott Fitzgerald.");
        book = ItemFactory.createBook("Norwegian Wood", 2, "Norwegian Wood is a 1987 novel by Japanese author Haruki Murakami.");
        book = ItemFactory.createBook("Wild Sheep Chase", 3, "A Wild Sheep Chase is the third novel by Japanese author Haruki Murakami.");
        book = ItemFactory.createBook("Alchemist", 4, "The Alchemist is a novel by Brazilian author Paulo Coelho that was first published in 1988.");

    }

    static void printTechnicalPapers() {
        technicalPaper = ItemFactory.createTechnicalPaper("Quantitative Analysis of Volcanic Eruptions", 5, "Precise eruption analysis using multispectral satellite imagery");
        technicalPaper = ItemFactory.createTechnicalPaper("Real-Time Monitoring and Early Warning for Volcanic Activity.", 6,"Advanced system for real-time prediction and early warnings.");
        technicalPaper = ItemFactory.createTechnicalPaper( "Impacts of Volcanic Ash on Aviation: Modeling and Mitigation.", 7, "Modeling volcanic ash effects on aviation and mitigation strategies");
        technicalPaper = ItemFactory.createTechnicalPaper("Investigations of Submarine Volcanoes", 8, "Study of submarine volcanoes using underwater observatories");

    }

    static void printVideo() {
        video = ItemFactory.createVideo("pursuit of happiness", 9,"Embark on a transformative journey exploring the universal pursuit of happiness in this captivating video.");
        video = ItemFactory.createVideo("pursuit of wonder", 10,"Embark on a transformative journey exploring the universal pursuit of happiness in this captivating video.");
        video = ItemFactory.createVideo("stoicism", 11,"Discover the power of Stoicism: a timeless philosophy for finding inner peace and resilience in the face of life's challenges.");
        video = ItemFactory.createVideo("volcano erupting", 12,"Experience the raw power and breathtaking spectacle of a volcanic eruption captured in stunning detail.");

    }

    static void printJournal() {
        journal = ItemFactory.createJournal("Medic", 13, "Medic is a peer-reviewed open-access medical journal published by MDPI.");
        journal = ItemFactory.createJournal("engineering", 14, "Engineering is an international peer-reviewed open access monthly journal published by MDPI.");
        journal = ItemFactory.createJournal("politic", 15, "Politics is an international peer-reviewed open access quarterly journal published by MDPI.");
        journal = ItemFactory.createJournal("machine learning", 16, "Machine Learning is an international peer-reviewed open access quarterly journal published by MDPI.");

    }
}
