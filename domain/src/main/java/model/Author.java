package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


    @Entity(name = "author")
    public class Author implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "author_id")
        private long id;

        @OneToMany(mappedBy = "book_id")
        private List<Book> books;

        private String first_name;

        private String last_name;

        private String birth_place;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getBirth_place() {
            return birth_place;
        }

        public void setBirth_place(String birth_place) {
            this.birth_place = birth_place;
        }
    }

