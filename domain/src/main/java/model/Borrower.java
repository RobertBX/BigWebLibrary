package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

import java.io.Serializable;



@Entity(name = "borrower")
public class Borrower implements  Serializable{


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "borrower_id")
        private long id;

        @NotNull
        private String first_name;

        @NotNull
        private String last_name;


        @OneToOne
        @JoinColumn(name = "borrower_details_id")
        private Borrower_details borrower_details;
    }

