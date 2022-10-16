package com.nttdata.bootcamp.ms.client.application;

import com.nttdata.bootcamp.ms.commons.base.domain.ClientDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {

    Mono<ClientDTO> create(ClientDTO clientDTO);
    Flux<ClientDTO> listAll();

}
