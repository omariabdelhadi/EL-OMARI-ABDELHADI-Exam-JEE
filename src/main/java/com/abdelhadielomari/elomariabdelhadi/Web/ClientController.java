package com.abdelhadielomari.elomariabdelhadi.Web;

import com.abdelhadielomari.elomariabdelhadi.DTOs.ClientDTO;
import com.abdelhadielomari.elomariabdelhadi.Service.ClientServerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientServerce clientServerce;

    @GetMapping("/Clients")
    public List<ClientDTO> getAllClient(){
        return clientServerce.getAllClient();
    }
}
