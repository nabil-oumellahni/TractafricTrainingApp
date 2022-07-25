package com.tractafricapp.services;

import com.tractafricapp.dao.ClientRepository;
import com.tractafricapp.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author N.Oumellahni
 * at 1:33 PM - 7/20/2022
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }


    public Client findClientById(Long id) {
        return  clientRepository.findById(id).get();
    }

    public Client addClient (@RequestBody Client client) {
        client.setCodeClient(UUID.randomUUID().toString());
        return clientRepository.save(client);
    }

    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

}
