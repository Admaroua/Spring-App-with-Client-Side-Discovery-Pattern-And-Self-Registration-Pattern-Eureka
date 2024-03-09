package com.esisba.msscolarite;

import com.esisba.msscolarite.Entities.Etablissement;
import com.esisba.msscolarite.Entities.Etudiant;
import com.esisba.msscolarite.Repositories.EtablissementRepository;
import com.esisba.msscolarite.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class MsScolariteApplication implements CommandLineRunner {
    @Autowired
    EtablissementRepository etablissementRepository;
    @Autowired
    EtudiantRepository etudiantRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etablissement etab1=new Etablissement(null,"esi-sba",null);
        Etablissement etab2=new Etablissement(null,"esi-alger",null);
        etablissementRepository.save(etab1);
        etablissementRepository.save(etab2);
        Etudiant etudiant1=new Etudiant(null,"marwa", Date.valueOf("2001-06-03"),"4-siw",Date.valueOf("2020-12-14"),etab1,1L,null);
        Etudiant etudiant2=new Etudiant(null,"adem", Date.valueOf("2001-06-03"),"4-isi",Date.valueOf("2020-12-14"),etab2,2L,null);
        Etudiant etudiant3=new Etudiant(null,"yacine", Date.valueOf("2001-06-03"),"4-siw",Date.valueOf("2020-12-14"),etab1,3L,null);
        etudiantRepository.save(etudiant1);
        etudiantRepository.save(etudiant2);
        etudiantRepository.save(etudiant3);








    }
}