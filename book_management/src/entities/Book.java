package entities;

public class Book extends Document {
    private Author author;
    private String numberPage;
    public Book(String id, String nxb, int numberPublish) {
        super(id, nxb, numberPublish);
    }
}
