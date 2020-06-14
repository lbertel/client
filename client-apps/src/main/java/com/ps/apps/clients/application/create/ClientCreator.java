package com.ps.apps.clients.application.create;

import com.ps.apps.clients.domain.Client;
import com.ps.apps.clients.domain.ClientRepository;
import org.springframework.stereotype.Component;


@Component
public final class ClientCreator {

    private final ClientRepository repository;

    public ClientCreator(ClientRepository repository) {
        this.repository = repository;
    }

    public void create(String id, String dni, String name, String surname, Integer age, String address){
        Client client = new Client(id, dni, name, surname, age, address);

        repository.save(client);
    }

}
