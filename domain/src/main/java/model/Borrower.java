package model;

import javax.persistence.*;
import java.io.Serializable;



@Entity(name = "borrower")
public class Borrower implements  Serializable{


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "borrower_id")
        private long id;

        private String first_name;

        private String last_name;


        @OneToOne
        @JoinColumn(name = "borrower_details_id")
        private Borrower_details borrower_details;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
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

        public Borrower_details getBorrower_details() {
                return borrower_details;
        }

        public void setBorrower_details(Borrower_details borrower_details) {
                this.borrower_details = borrower_details;
        }
}

