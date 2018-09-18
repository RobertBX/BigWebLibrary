package model;

import com.sun.istack.internal.NotNull;

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

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date rental_date;
}


