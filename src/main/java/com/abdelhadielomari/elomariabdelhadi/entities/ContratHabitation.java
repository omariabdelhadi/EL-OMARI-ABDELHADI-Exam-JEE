package com.abdelhadielomari.elomariabdelhadi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratHabitation extends Contrat {
    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;
    private String adresse;
    private Double superficie;
}
