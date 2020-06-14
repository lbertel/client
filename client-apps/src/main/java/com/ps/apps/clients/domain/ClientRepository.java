package com.ps.apps.clients.domain;

import java.util.Optional;

public interface ClientRepository {

    void save(Client client);
    Optional<Client> search(String id);

}
