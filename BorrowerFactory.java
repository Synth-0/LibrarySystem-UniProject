
import java.util.HashMap;
import java.util.Map;

public class BorrowerFactory {
    private static Map<Integer, Integer> idCountMap = new HashMap<>();

    public static Borrower createBorrower(String job, String name, int id) {
        int count = idCountMap.getOrDefault(id, 0);
        if (count >= 5) {
            throw new IllegalArgumentException("ID " + id + " has reached the maximum limit of usage.");
        }

        Borrower borrower = new Borrower(job, name, id);
        idCountMap.put(id, count + 1);

        return borrower;
    }
}
