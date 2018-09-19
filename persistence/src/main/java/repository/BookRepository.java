package repository;

import javax.persistence.EntityManager;
import java.awt.print.Book;
import java.util.List;

public class BookRepository extends GenericDao<Book, Long>{

    public BookRepository(EntityManager entityManager) {
        super(entityManager);
    }
//
//    public Book finAllBooks(){
//        List<Book> allBooks= new List<Book>()
//
//    }
}