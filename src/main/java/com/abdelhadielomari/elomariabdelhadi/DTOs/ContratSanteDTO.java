package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import com.abdelhadielomari.elomariabdelhadi.entities.NiveauCouverture;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ContratSanteDTO extends ContratDTO{

    private NiveauCouverture niveauCouverture;
    private int nombrePersonnesCouvertes;
    private Long clientId;
}
