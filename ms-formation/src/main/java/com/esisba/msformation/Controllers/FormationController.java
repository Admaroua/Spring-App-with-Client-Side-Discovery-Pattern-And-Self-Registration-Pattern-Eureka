package com.esisba.msformation.Controllers;

import com.esisba.msformation.Entities.Formation;
import com.esisba.msformation.Proxy.EtudiantProxy;
import com.esisba.msformation.Repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")

public class FormationController {
    @Autowired
    FormationRepository formationRepository;
    @Autowired
    EtudiantProxy etudiantProxy;
    @GetMapping("/formations/{idf}")
    Formation getFormationWithEtudiant(@PathVariable Long idf){
        Formation formation=formationRepository.findById(idf).orElse(null);
        formation.setEtudiants(new ArrayList(etudiantProxy.getLesEtudiants(idf).getContent()));
        return formation;

    }
}
