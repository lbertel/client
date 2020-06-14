package com.ps.apps.clients.infrastructure;

import com.ps.apps.clients.domain.Client;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Optional;

final class InMemoryClientRepositoryTest {

    @Test
    void save_a_valid_client(){
        InMemoryClientRepository repository = new InMemoryClientRepository();

        repository.save(
            new Client(
                "some-id",
                "some-dni",
                "some-name",
                "some-surname",
                55,
                "some-address"
            )
        );
    }

    @Test
    void search_an_existing_client(){
        InMemoryClientRepository repository = new InMemoryClientRepository();

        Client client = new Client(
            "some-id",
            "some-dni",
            "some-name",
            "some-surname",
            55,
            "some-address"
        );

        repository.save(client);

        Assert.assertEquals(Optional.of(client), repository.search(client.getId()));

    }

    @Test
    void not_find_a_non_existing_client(){
        InMemoryClientRepository repository = new InMemoryClientRepository();

        Assert.assertFalse(repository.search("non-existing-id").isPresent());
    }

}
