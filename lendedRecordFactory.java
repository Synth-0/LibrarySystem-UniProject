public class lendedRecordFactory {
    public static LendedRecord createLendedRecords(String borrowerName, int borrowerId, int itemid, String itemTitle,
            String borrowerJob) {
        LendedRecord lend = new LendedRecord(borrowerName, borrowerId, itemid, itemTitle, borrowerJob);

        return lend;
    }
}
