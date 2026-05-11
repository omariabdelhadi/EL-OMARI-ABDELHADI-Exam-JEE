package com.abdelhadielomari.elomariabdelhadi.Service;

import com.abdelhadielomari.elomariabdelhadi.DTOs.ClientDTO;
import com.abdelhadielomari.elomariabdelhadi.DTOs.PaiementDTO;
import com.abdelhadielomari.elomariabdelhadi.Mappers.PaiementMapper;
import com.abdelhadielomari.elomariabdelhadi.entities.Client;
import com.abdelhadielomari.elomariabdelhadi.entities.Paiement;
import com.abdelhadielomari.elomariabdelhadi.repositories.PaiementReposetory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class PaiementImplement implements PaiementServerce{
    @Autowired
    private PaiementReposetory paiementReposetory;
    @Autowired
    private PaiementMapper paiementMapper;
    @Override
    public List<PaiementDTO> getAllPaiement() {
        List<Paiement> paiementList=paiementReposetory.findAll();
        List<PaiementDTO> paiementDTOList=new ArrayList<>();
        paiementList.forEach(c->paiementDTOList.add(paiementMapper.toDTO(c)));
        return paiementDTOList;
    }
}
