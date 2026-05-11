package com.abdelhadielomari.elomariabdelhadi.repositories;

import com.abdelhadielomari.elomariabdelhadi.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementReposetory extends JpaRepository<Paiement,Long> {
}
