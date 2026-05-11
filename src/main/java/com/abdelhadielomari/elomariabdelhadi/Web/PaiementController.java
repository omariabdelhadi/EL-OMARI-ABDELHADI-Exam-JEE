package com.abdelhadielomari.elomariabdelhadi.Web;


import com.abdelhadielomari.elomariabdelhadi.DTOs.PaiementDTO;
import com.abdelhadielomari.elomariabdelhadi.Service.PaiementServerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaiementController {
    @Autowired
    private PaiementServerce paiementServerce;

    @GetMapping("/paiements")
    public List<PaiementDTO> getAllPaiement(){
        return paiementServerce.getAllPaiement();
    }
}
