package com.abdelhadielomari.elomariabdelhadi.DTOs;

import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import com.abdelhadielomari.elomariabdelhadi.entities.TypePaiement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaiementDTO {

    private Long id;
    private Date date;
    private Double montant;
    private TypePaiement type;
    private Long contratId;


}
