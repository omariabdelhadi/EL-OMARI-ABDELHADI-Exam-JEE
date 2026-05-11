package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Client;
import com.abdelhadielomari.elomariabdelhadi.entities.Paiement;
import com.abdelhadielomari.elomariabdelhadi.entities.StatutContrat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ContratDTO {

    private Long id;
    private Date dateSouscription;
    private StatutContrat statut;
    private Date dateValidation;
    private Double montantCotisation;
    private int dureeContrat;
    private Double tauxCouverture;

}
