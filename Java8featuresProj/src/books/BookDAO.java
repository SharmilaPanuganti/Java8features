package books;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(101,"Core Java",400));
        books.add(new Book(102,"Hibernate",500));
        books.add(new Book(103,"Collections",300));
        return books;
    }
}
