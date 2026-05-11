package com.abdelhadielomari.elomariabdelhadi.Service;

import com.abdelhadielomari.elomariabdelhadi.DTOs.ClientDTO;
import com.abdelhadielomari.elomariabdelhadi.Mappers.ClientMapper;
import com.abdelhadielomari.elomariabdelhadi.entities.Client;
import com.abdelhadielomari.elomariabdelhadi.repositories.ClientReposetory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClientImplement implements ClientServerce {
    @Autowired
    private ClientReposetory clientReposetory;
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public List<ClientDTO> getAllClient() {
        List<Client> clientList=clientReposetory.findAll();
        List<ClientDTO> clientDTOList=new ArrayList<>();
        clientList.forEach(c->clientDTOList.add(clientMapper.toDTO(c)));
        return clientDTOList;
    }
}
