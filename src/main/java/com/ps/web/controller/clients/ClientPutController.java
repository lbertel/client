package com.ps.web.controller.clients;

import com.ps.apps.clients.application.create.ClientCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public final class ClientPutController {

    private final ClientCreator creator;

    public ClientPutController(ClientCreator creator) {
        this.creator = creator;
    }


    @PutMapping(value = "/client/{id}")
    public ResponseEntity<String> create(@PathVariable String id, @RequestBody RequestClient request){

        creator.create(
            id,
            request.getDni(),
            request.getName(),
            request.getSurname(),
            request.getAge(),
            request.getAddress()
        );

        return new ResponseEntity(HttpStatus.CREATED);

    }

}
