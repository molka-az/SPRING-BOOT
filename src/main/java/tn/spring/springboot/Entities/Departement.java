package Entities;


import javax.persistence.*;

@Entity
@Table(name = "Departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idDepart")

    private int idDepart;
    private String nomDepart;

}
