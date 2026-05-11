package com.abdelhadielomari.elomariabdelhadi;

import com.abdelhadielomari.elomariabdelhadi.entities.*;
import com.abdelhadielomari.elomariabdelhadi.entities.repositories.ClientReposetory;
import com.abdelhadielomari.elomariabdelhadi.entities.repositories.ContratRepository;
import com.abdelhadielomari.elomariabdelhadi.entities.repositories.PaiementReposetory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ElOmariAbdelhadiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElOmariAbdelhadiApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            ClientReposetory clientRepository,
            ContratRepository contratRepository,
            PaiementReposetory paiementRepository
    ){
        return args -> {

            // ======== Créer des Clients ========
            Client client1 = new Client();
            client1.setNom("Abdelhadi El Omari");
            client1.setEmail("abdelhadi@gmail.com");
            clientRepository.save(client1);

            Client client2 = new Client();
            client2.setNom("Sara Alaoui");
            client2.setEmail("sara@gmail.com");
            clientRepository.save(client2);

            // ======== Contrat Automobile ========
            ContratAutomobile ca = new ContratAutomobile();
            ca.setDateSouscription(new Date());
            ca.setStatut(StatutContrat.EN_COURS);
            ca.setDateValidation(new Date());
            ca.setMontantCotisation(1500.0);
            ca.setDureeContrat(12);
            ca.setTauxCouverture(80.0);
            ca.setClient(client1);
            ca.setNumeroImmatriculation("A-1234-B");
            ca.setMarque("Toyota");
            ca.setModele("Corolla");
            contratRepository.save(ca);

            // ======== Contrat Habitation ========
            ContratHabitation ch = new ContratHabitation();
            ch.setDateSouscription(new Date());
            ch.setStatut(StatutContrat.VALIDE);
            ch.setDateValidation(new Date());
            ch.setMontantCotisation(2000.0);
            ch.setDureeContrat(24);
            ch.setTauxCouverture(90.0);
            ch.setClient(client1);
            ch.setTypeLogement(TypeLogement.APPARTEMENT);
            ch.setAdresse("Rue Hassan II, Casablanca");
            ch.setSuperficie(120.0);
            contratRepository.save(ch);

            // ======== Contrat Sante ========
            ContratSante cs = new ContratSante();
            cs.setDateSouscription(new Date());
            cs.setStatut(StatutContrat.EN_COURS);
            cs.setDateValidation(new Date());
            cs.setMontantCotisation(800.0);
            cs.setDureeContrat(6);
            cs.setTauxCouverture(70.0);
            cs.setClient(client2);
            cs.setNiveauCouverture(NiveauCouverture.PREMIUM);
            cs.setNombrePersonnesCouvertes(4);
            contratRepository.save(cs);

            // ======== Paiements ========
            Paiement p1 = new Paiement();
            p1.setDate(new Date());
            p1.setMontant(500.0);
            p1.setType(TypePaiement.MENSUALITE);
            p1.setContrat(ca);
            paiementRepository.save(p1);

            Paiement p2 = new Paiement();
            p2.setDate(new Date());
            p2.setMontant(2000.0);
            p2.setType(TypePaiement.PAIEMENT_ANNUEL);
            p2.setContrat(ch);
            paiementRepository.save(p2);

            Paiement p3 = new Paiement();
            p3.setDate(new Date());
            p3.setMontant(300.0);
            p3.setType(TypePaiement.PAIEMENT_EXCEPTIONNEL);
            p3.setContrat(cs);
            paiementRepository.save(p3);

            System.out.println("======== Base de données alimentée avec succès ========");
        };
    }
}
