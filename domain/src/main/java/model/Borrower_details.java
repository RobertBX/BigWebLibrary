package model;

import javax.persistence.*;

@Entity(name ="borrower details" )
public class Borrower_details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boorrower_details_id")
    private long id;

    private String addres;

    private String email;

    private  String phone;

    @OneToOne(mappedBy = "borrower_id")
    private Borrower borrower;

}
