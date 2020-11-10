package com.dev.demo.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "node")
@ToString
public class Node {
    @Id
    private String id;
    private String nodeRoot;
    private String nodeDesc;

    public Node() {}

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
