package com.abdelhadielomari.elomariabdelhadi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratAutomobile extends Contrat {
    private String numeroImmatriculation;
    private String marque;
    private String modele;
}
