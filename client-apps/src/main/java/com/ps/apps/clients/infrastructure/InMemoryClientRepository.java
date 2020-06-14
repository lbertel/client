package com.ps.apps.clients.infrastructure;

import com.ps.apps.clients.domain.Client;
import com.ps.apps.clients.domain.ClientRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

/*
Dummy implementation for testing
*/

@Repository
public final class InMemoryClientRepository implements ClientRepository {

    private final HashMap<String, Client> clients = new HashMap<>();

    @Override
    public void save(Client client) {
        this.clients.put(client.getId(), client);
    }

    @Override
    public Optional<Client> search(String id) {
        return Optional.ofNullable(clients.get(id));
    }

}
