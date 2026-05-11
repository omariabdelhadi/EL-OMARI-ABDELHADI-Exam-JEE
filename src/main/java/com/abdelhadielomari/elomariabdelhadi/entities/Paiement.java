package com.abdelhadielomari.elomariabdelhadi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Double montant;

    @Enumerated(EnumType.STRING)
    private TypePaiement type;

    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
}
