package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "borrow")
public class Borrow implements Serializable {

    @Id
    @Column(name = "borrow_id")
    private long id;

    @ManyToOne
    @JoinColumn(name ="book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private Borrower borrower;

    @Temporal(TemporalType.DATE)
    private Date rental_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }
}


