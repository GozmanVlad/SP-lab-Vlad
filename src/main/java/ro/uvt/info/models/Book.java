package ro.uvt.info.models;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Book extends Section implements Visitee {
    private final List<Author> authorList;
    public Book(String title) {
        super(title);
        authorList = new ArrayList<>();
    }

    public Book(Book other){
        super(other.title);
        this.authorList = new ArrayList<>(other.authorList);
    }

    public void addAuthor(Author author) {
        this.authorList.add(new Author(author));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}