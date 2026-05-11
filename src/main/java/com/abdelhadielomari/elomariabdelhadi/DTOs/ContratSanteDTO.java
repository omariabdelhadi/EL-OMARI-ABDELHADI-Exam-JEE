package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import com.abdelhadielomari.elomariabdelhadi.entities.NiveauCouverture;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratSanteDTO{

    private NiveauCouverture niveauCouverture;
    private int nombrePersonnesCouvertes;
}
