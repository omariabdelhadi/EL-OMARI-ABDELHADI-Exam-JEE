package com.abdelhadielomari.elomariabdelhadi.Mappers;
import com.abdelhadielomari.elomariabdelhadi.DTOs.PaiementDTO;
import com.abdelhadielomari.elomariabdelhadi.entities.Contrat;
import com.abdelhadielomari.elomariabdelhadi.entities.Paiement;
import org.springframework.stereotype.Component;

@Component
public class PaiementMapper {

    public PaiementDTO toDTO(Paiement paiement) {
        PaiementDTO dto = new PaiementDTO();
        dto.setId(paiement.getId());
        dto.setDate(paiement.getDate());
        dto.setMontant(paiement.getMontant());
        dto.setType(paiement.getType());
        dto.setContratId(paiement.getContrat().getId());
        return dto;
    }

    public Paiement toEntity(PaiementDTO dto, Contrat contrat) {
        Paiement paiement = new Paiement();
        paiement.setId(dto.getId());
        paiement.setDate(dto.getDate());
        paiement.setMontant(dto.getMontant());
        paiement.setType(dto.getType());
        paiement.setContrat(contrat);
        return paiement;
    }
}
