package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import com.abdelhadielomari.elomariabdelhadi.entities.TypeLogement;
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
public class ContratHabitationDTO extends ContratDTO{

    private TypeLogement typeLogement;
    private String adresse;
    private Double superficie;
    private Long clientId;
}
