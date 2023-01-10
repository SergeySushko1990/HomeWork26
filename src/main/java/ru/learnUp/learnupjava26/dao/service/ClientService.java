package ru.learnUp.learnupjava26.dao.service;

import org.springframework.stereotype.Service;
import ru.learnUp.learnupjava26.dao.entity.Client;
import ru.learnUp.learnupjava26.dao.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.getById(id);
    }
}
