import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * ReturnItem
 */
public class ReturnItem {

    public static void returnItem() {
        printBorrowedItems();
        remove();
        printBorrowedItems();
    }
    static void printBorrowedItems() {
        for (LendedRecord lended : App.lend) {
            System.out.println(lended.toString());
        }
    }

    public static void remove() { // for returning items
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of the returner: ");
        int borrowerId = sc.nextInt();
        System.out.println("Enter id of the item: ");
        int itemId = sc.nextInt();
        for (int i = 0; i < App.lend.size(); i++) {
            
            if (App.lend.get(i).getId() == borrowerId && App.lend.get(i).getItemId() == itemId) {
                LocalDate borrowedDate = App.lend.get(i).gBDate();
                LocalDate returnDate = App.lend.get(i).getCurrentDate();
                long daysDifference = dateDifference(borrowedDate, returnDate);
                int fee = feeCalculator(App.lend.get(i).getItemId(), App.lend.get(i).getItemTitle(), App.lend.get(i).getId(),
                        daysDifference);
                System.out.println("the fee is "+fee+"$");
                App.lend.remove(i);
                break;
            }
        }
    }
    public static long dateDifference(LocalDate d1, LocalDate d2) {
        long daysDifference = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Days difference: " + daysDifference);
        return daysDifference;
    }
    public static int feeCalculator(int id, String type, int personId, long dateDifference) {
        int bookFee = 3;
        int journalFee = 3;
        int videoFee = 1;
        int TechnicalPaperFee = 2;
        long total = 0;

        if (type.equals("book")) {
            if (dateDifference > 14) {
                dateDifference = dateDifference - 14;
                total = dateDifference * bookFee;
            } else {
                total = 0;
            }
        } else if (type.equals("journal")) {
            if (dateDifference > 14) {
                dateDifference = dateDifference - 14;
                total = dateDifference * journalFee;
            } else {
                total = 0;
            }
        } else if (type.equals("video")) {
            if (dateDifference > 14) {
                dateDifference = dateDifference - 14;
                total = dateDifference * videoFee;
            } else {
                total = 0;
            }
        } else if (type.equals("technicalPaper")) {
            if (dateDifference > 14) {
                dateDifference = dateDifference - 14;
                total = dateDifference * TechnicalPaperFee;
            } else {
                total = 0;
            }
        }

        return (int) total;
    }
}