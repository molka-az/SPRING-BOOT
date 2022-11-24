package Entities;

import javax.persistence.*;

@Entity
@Table(name = "DetailEquipe")
public class DetailEquipe {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name="salle")

    private Long salle; // Clé primaire

    private String thematique;

}
