package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ContratAutomobileDTO extends ContratDTO{
    private String numeroImmatriculation;
    private String marque;
    private String modele;
    private Long clientId;
}
