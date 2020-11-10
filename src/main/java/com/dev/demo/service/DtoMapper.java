package com.dev.demo.service;

import com.dev.demo.dto.NodeDto;
import com.dev.demo.model.Node;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class DtoMapper {

    public Mono<NodeDto> convertToResponseDto(Node node) {
        NodeDto nodeDto = new NodeDto();
        nodeDto.setId(node.getId());
        nodeDto.setNodeRoot(node.getNodeRoot());
        nodeDto.setNodeDesc(node.getNodeDesc());
        return Mono.just(nodeDto);
    }

    public Node convertToEntity(NodeDto nodeDto) {
        Node node = new Node();
        node.setNodeRoot(nodeDto.getNodeRoot());
        node.setNodeDesc(nodeDto.getNodeDesc());
        return node;
    }
}
