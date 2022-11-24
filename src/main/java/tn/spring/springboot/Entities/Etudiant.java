package Entities;


import javax.persistence.*;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name="idEtudiant")

    private Long idEtudiant; // Clé primaire

    private String prenomE;

    private String nomE;

    @Enumerated(EnumType.STRING)

    private Optionn option;

}
