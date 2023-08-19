package com.example.Stage.Controller;

import com.example.Stage.Entites.Client;
import com.example.Stage.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }

    @GetMapping("Client/{id}")
    public Optional<Client> getClientById(@PathVariable String id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PutMapping("Client/{id}")
    public Client updateClient(@PathVariable String id, @RequestBody Client updatedClient) {
        return clientService.updateClient(id, updatedClient);
    }

    @DeleteMapping("Client/{id}")
    public void deleteClient(@PathVariable String id) {
        clientService.deleteClient(id);
    }





}

