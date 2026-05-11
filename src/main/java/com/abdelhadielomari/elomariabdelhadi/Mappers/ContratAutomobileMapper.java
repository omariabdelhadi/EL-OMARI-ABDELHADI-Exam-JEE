package com.abdelhadielomari.elomariabdelhadi.Mappers;
import com.abdelhadielomari.elomariabdelhadi.DTOs.ContratAutomobileDTO;
import com.abdelhadielomari.elomariabdelhadi.entities.Client;
import com.abdelhadielomari.elomariabdelhadi.entities.ContratAutomobile;
import org.springframework.stereotype.Component;
@Component
public class ContratAutomobileMapper {

    public ContratAutomobileDTO toDTO(ContratAutomobile contrat) {
        ContratAutomobileDTO dto = new ContratAutomobileDTO();
        dto.setId(contrat.getId());
        dto.setDateSouscription(contrat.getDateSouscription());
        dto.setStatut(contrat.getStatut());
        dto.setDateValidation(contrat.getDateValidation());
        dto.setMontantCotisation(contrat.getMontantCotisation());
        dto.setDureeContrat(contrat.getDureeContrat());
        dto.setTauxCouverture(contrat.getTauxCouverture());
        dto.setClientId(contrat.getClient().getId());
        dto.setNumeroImmatriculation(contrat.getNumeroImmatriculation());
        dto.setMarque(contrat.getMarque());
        dto.setModele(contrat.getModele());
        return dto;
    }

    public ContratAutomobile toEntity(ContratAutomobileDTO dto, Client client) {
        ContratAutomobile contrat = new ContratAutomobile();
        contrat.setId(dto.getId());
        contrat.setDateSouscription(dto.getDateSouscription());
        contrat.setStatut(dto.getStatut());
        contrat.setDateValidation(dto.getDateValidation());
        contrat.setMontantCotisation(dto.getMontantCotisation());
        contrat.setDureeContrat(dto.getDureeContrat());
        contrat.setTauxCouverture(dto.getTauxCouverture());
        contrat.setClient(client);
        contrat.setNumeroImmatriculation(dto.getNumeroImmatriculation());
        contrat.setMarque(dto.getMarque());
        contrat.setModele(dto.getModele());
        return contrat;
    }
}
