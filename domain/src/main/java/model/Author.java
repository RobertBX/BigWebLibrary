package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class Author {


    @Entity(name = "author")
    public class AuthorRepository implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "author_id")
        public long id;

        @OneToMany(mappedBy = "book_id")
        private List<Book> books;

        @NotNull
        private String first_name;

        @NotNull
        private String last_name;

        private String birth_place;


    }
}