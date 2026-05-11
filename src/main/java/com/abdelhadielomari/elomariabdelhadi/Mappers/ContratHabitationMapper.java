package com.abdelhadielomari.elomariabdelhadi.Mappers;
import com.abdelhadielomari.elomariabdelhadi.DTOs.ContratHabitationDTO;
import com.abdelhadielomari.elomariabdelhadi.entities.Client;
import com.abdelhadielomari.elomariabdelhadi.entities.ContratHabitation;
import org.springframework.stereotype.Component;
@Component
public class ContratHabitationMapper {

    public ContratHabitationDTO toDTO(ContratHabitation contrat) {
        ContratHabitationDTO dto = new ContratHabitationDTO();
        dto.setId(contrat.getId());
        dto.setDateSouscription(contrat.getDateSouscription());
        dto.setStatut(contrat.getStatut());
        dto.setDateValidation(contrat.getDateValidation());
        dto.setMontantCotisation(contrat.getMontantCotisation());
        dto.setDureeContrat(contrat.getDureeContrat());
        dto.setTauxCouverture(contrat.getTauxCouverture());
        dto.setClientId(contrat.getClient().getId());
        dto.setTypeLogement(contrat.getTypeLogement());
        dto.setAdresse(contrat.getAdresse());
        dto.setSuperficie(contrat.getSuperficie());
        return dto;
    }

    public ContratHabitation toEntity(ContratHabitationDTO dto, Client client) {
        ContratHabitation contrat = new ContratHabitation();
        contrat.setId(dto.getId());
        contrat.setDateSouscription(dto.getDateSouscription());
        contrat.setStatut(dto.getStatut());
        contrat.setDateValidation(dto.getDateValidation());
        contrat.setMontantCotisation(dto.getMontantCotisation());
        contrat.setDureeContrat(dto.getDureeContrat());
        contrat.setTauxCouverture(dto.getTauxCouverture());
        contrat.setClient(client);
        contrat.setTypeLogement(dto.getTypeLogement());
        contrat.setAdresse(dto.getAdresse());
        contrat.setSuperficie(dto.getSuperficie());
        return contrat;
    }
}
