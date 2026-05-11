package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratAutomobileDTO{
    private String numeroImmatriculation;
    private String marque;
    private String modele;
}
