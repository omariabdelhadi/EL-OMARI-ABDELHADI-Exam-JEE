package com.abdelhadielomari.elomariabdelhadi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratSante extends Contrat {
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveauCouverture;
    private int nombrePersonnesCouvertes;
}
