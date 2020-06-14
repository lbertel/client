package com.ps.apps.clients.application.create;

import com.ps.apps.clients.domain.Client;
import com.ps.apps.clients.domain.ClientRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class ClientCreatorTest {

    @Test
    void save_a_valid_client() {
        ClientRepository repository = mock(ClientRepository.class);
        ClientCreator creator = new ClientCreator(repository);

        Client client = new Client(
            "some-id",
            "some-dni",
            "some-name",
            "some-surname",
            55,
            "some-address"
        );

        creator.create(
            client.getId(),
            client.getDni(),
            client.getName(),
            client.getSurname(),
            client.getAge(),
            client.getAddress()
        );

        verify(repository, atLeastOnce()).save(client);
    }

}
