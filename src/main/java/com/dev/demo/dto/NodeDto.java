package com.dev.demo.dto;

import lombok.Data;

@Data
public class NodeDto {
    private String id;
    private String nodeRoot;
    private String nodeDesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNodeRoot() {
        return nodeRoot;
    }

    public void setNodeRoot(String nodeRoot) {
        this.nodeRoot = nodeRoot;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }
}
