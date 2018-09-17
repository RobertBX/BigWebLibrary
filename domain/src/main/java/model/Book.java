package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity(name = "book")
public class Book implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;

    @OneToMany(mappedBy = "borrow_id")
    private boolean borrow;

    @NotNull
    private String category;

    private long isbn;

    private int pages;

    private Date releaseDate;

    private String summary;

    @NotNull
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;




}


