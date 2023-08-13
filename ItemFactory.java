public class ItemFactory {
    public static Item createBook(String title, int id, String description) {
        Book book = new Book(title, id, description);
        book.setName(title);
        book.setId(id);
        book.setDescription(description);
        return book;
    }
    public static Item createJournal(String title, int id, String description) {
        Journal j = new Journal(title, id, description);
        j.setName(title);
        j.setId(id);
        j.setDescription(description);
        return j;
    }
    public static Item createTechnicalPaper(String title, int id, String description) {
        TechnicalPaper tc = new TechnicalPaper(title, id, description);
        tc.setName(title);
        tc.setId(id);
        tc.setDescription(description);
        return tc;
    }
    public static Item createVideo(String title, int id, String description) {
        Video vid = new Video(title, id,description);
        vid.setName(title);
        vid.setId(id);
        vid.setDescription(description);
        return vid;
    }
}
