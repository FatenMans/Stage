package com.example.Stage.Service;

import com.example.Stage.Entites.Client;
import com.example.Stage.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {
    @Autowired
    public ClientRepository clientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;




    public List<Client> getAllClient(){

        return clientRepository.findAll();
    }

    public Client createClient(Client client)
    {
        return  clientRepository.save(client);
    }
    public Optional<Client> getClientById(String id) {
        return clientRepository.findById(id);
    }

    public Client updateClient(String id, Client updatedClient) {
        updatedClient.setId(id);
        return clientRepository.save(updatedClient);
    }

    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }



}
