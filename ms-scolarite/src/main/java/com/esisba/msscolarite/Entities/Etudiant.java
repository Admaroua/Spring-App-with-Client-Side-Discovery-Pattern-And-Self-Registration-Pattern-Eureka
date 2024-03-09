package com.esisba.msscolarite.Entities;

import com.esisba.msscolarite.Models.Formation;
import com.esisba.msscolarite.Models.Virement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String promo;
    @Temporal(TemporalType.DATE)
    private Date dateInscription;
    @ManyToOne
    @JsonIgnore
    private Etablissement etablissement;

    private Long idFormation;
    @Transient
    private Formation formation;


}
