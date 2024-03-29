package com.esisba.msscolarite.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "toformation",types = Etudiant.class)
public interface EtudiantProjection {

    @Value("#{target.nom}")
    public String getNom();
    @Value("#{target.etablissement.nom}")
    public String getNomEtablissement();
}
