package com.abdelhadielomari.elomariabdelhadi.Mappers;
import com.abdelhadielomari.elomariabdelhadi.DTOs.ContratSanteDTO;
import com.abdelhadielomari.elomariabdelhadi.entities.Client;
import com.abdelhadielomari.elomariabdelhadi.entities.ContratSante;
import org.springframework.stereotype.Component;

@Component
public class ContratSanteMapper {

    public ContratSanteDTO toDTO(ContratSante contrat) {
        ContratSanteDTO dto = new ContratSanteDTO();
        dto.setId(contrat.getId());
        dto.setDateSouscription(contrat.getDateSouscription());
        dto.setStatut(contrat.getStatut());
        dto.setDateValidation(contrat.getDateValidation());
        dto.setMontantCotisation(contrat.getMontantCotisation());
        dto.setDureeContrat(contrat.getDureeContrat());
        dto.setTauxCouverture(contrat.getTauxCouverture());
        dto.setClientId(contrat.getClient().getId());
        dto.setNiveauCouverture(contrat.getNiveauCouverture());
        dto.setNombrePersonnesCouvertes(contrat.getNombrePersonnesCouvertes());
        return dto;
    }

    public ContratSante toEntity(ContratSanteDTO dto, Client client) {
        ContratSante contrat = new ContratSante();
        contrat.setId(dto.getId());
        contrat.setDateSouscription(dto.getDateSouscription());
        contrat.setStatut(dto.getStatut());
        contrat.setDateValidation(dto.getDateValidation());
        contrat.setMontantCotisation(dto.getMontantCotisation());
        contrat.setDureeContrat(dto.getDureeContrat());
        contrat.setTauxCouverture(dto.getTauxCouverture());
        contrat.setClient(client);
        contrat.setNiveauCouverture(dto.getNiveauCouverture());
        contrat.setNombrePersonnesCouvertes(dto.getNombrePersonnesCouvertes());
        return contrat;
    }
}
