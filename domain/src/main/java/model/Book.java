package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity(name = "book")
public class Book implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;

    @OneToMany(mappedBy = "borrow_id")
    private List<Borrow> borrow;

    @NotNull
    private String category;

    @NotEmpty
    private long isbn;

    private int pages;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    private String summary;

    @NotNull
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;




}


