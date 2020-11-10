package com.dev.demo.service;

import com.dev.demo.model.Node;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NodeService {
    Flux<Node> getAll();

    Mono save(final Node testNode);
}
