package Entities;


import javax.persistence.*;

@Entity
@Table(name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idUniv")
    private int idUniv;

    private String nomUniv;
}
