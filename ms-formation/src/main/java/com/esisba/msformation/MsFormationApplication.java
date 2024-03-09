package com.esisba.msformation;

import com.esisba.msformation.Entities.Formation;
import com.esisba.msformation.Repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {
    @Autowired
    FormationRepository formationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation f1=new Formation(null,"formation1",5,null);
        Formation f2=new Formation(null,"formation2",2,null);
        Formation f3=new Formation(null,"formation3",3,null);
        formationRepository.save(f1);
        formationRepository.save(f2);
        formationRepository.save(f3);



    }
}
