package com.dev.demo.service;

import com.dev.demo.model.Node;
import com.dev.demo.repository.NodeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class NodeServiceImpl implements NodeService {
    private final NodeRepository nodeRepository;

    public NodeServiceImpl(NodeRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    public Flux<Node> getAll() {
        return nodeRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono save(final Node node) {
        return nodeRepository.save(node);
    }
}
