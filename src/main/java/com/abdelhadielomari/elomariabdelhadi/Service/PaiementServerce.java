package com.abdelhadielomari.elomariabdelhadi.Service;

import com.abdelhadielomari.elomariabdelhadi.DTOs.PaiementDTO;
import com.abdelhadielomari.elomariabdelhadi.entities.Paiement;

import java.util.List;

public interface PaiementServerce {
    List<PaiementDTO> getAllPaiement();
}
