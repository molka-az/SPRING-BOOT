package Entities;

import javax.persistence.*;

@Entity
@Table(name = "Equipe")
public class Equipe {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name="idEtudiant")

    private Long idEtudiant; // Clé primaire

    private String prenomE;

    private String nomE;}
