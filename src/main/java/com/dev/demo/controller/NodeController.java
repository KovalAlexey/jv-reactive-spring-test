package com.dev.demo.controller;

import com.dev.demo.dto.NodeDto;
import com.dev.demo.service.DtoMapper;
import com.dev.demo.service.NodeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("/node")
@RestController
public class NodeController {
    private final NodeServiceImpl testNodeServiceImpl;
    private final DtoMapper dtoMapper;

    public NodeController(NodeServiceImpl testNodeServiceImpl,
                          DtoMapper dtoMapper) {
        this.testNodeServiceImpl = testNodeServiceImpl;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping
    public Flux<NodeDto> getAll() {
        System.out.println("Getting all nodes list...");
        return testNodeServiceImpl.getAll().flatMap(dtoMapper::convertToResponseDto);
    }

    @PostMapping
    public Mono save(@RequestBody final NodeDto nodeDto) {
        System.out.println("New node " + nodeDto.getNodeRoot() + " added successfully!");
        return testNodeServiceImpl.save(dtoMapper.convertToEntity(nodeDto));
    }
}
