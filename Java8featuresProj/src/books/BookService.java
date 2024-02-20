package books;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public static List<Book> getBooksSort(){
        List<Book> books=new BookDAO().getBooks();
        // Collections.sort(books,new Comparator<Book>() {
        //     public int compare(Book o1, Book o2) {
        //         return o1.getName().compareTo(o2.getName());
        //     };
        // });
        Collections.sort(books,(book1,book2)->{return book1.getName().compareTo(book2.getName());});
        return books;
    }
    public static void main(String[] args) {
        System.out.println(BookService.getBooksSort());
    }
}
