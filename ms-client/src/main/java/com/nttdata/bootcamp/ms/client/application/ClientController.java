package com.nttdata.bootcamp.ms.client.application;

import com.nttdata.bootcamp.ms.commons.base.domain.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ClientDTO> create(@RequestBody ClientDTO clientDTO) {
        return clientService.create(clientDTO);
    }

    @GetMapping(value = "listAll", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ClientDTO> listAll() {
        return clientService.listAll();
    }
}
