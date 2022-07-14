package com.projects.servermanager.models;

import com.projects.servermanager.enumeration.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;


@Entity
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "serverId", nullable = false)
    private Long serverId;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;

    public Server() {
    }

    public Server(String ipAddress, String name, String memory, String type, String imageUrl, Status status) {
        this.ipAddress = ipAddress;
        this.name = name;
        this.memory = memory;
        this.type = type;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public Server(Long serverId, String ipAddress, String name, String memory, String type, String imageUrl, Status status) {
        this.serverId = serverId;
        this.ipAddress = ipAddress;
        this.name = name;
        this.memory = memory;
        this.type = type;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Server)) return false;
        Server server = (Server) o;
        return getServerId().equals(server.getServerId()) && Objects.equals(getIpAddress(), server.getIpAddress()) && Objects.equals(getName(), server.getName()) && Objects.equals(getMemory(), server.getMemory()) && Objects.equals(getType(), server.getType()) && Objects.equals(getImageUrl(), server.getImageUrl()) && getStatus() == server.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getServerId(), getIpAddress(), getName(), getMemory(), getType(), getImageUrl(), getStatus());
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverId=" + serverId +
                ", ipAddress='" + ipAddress + '\'' +
                ", name='" + name + '\'' +
                ", memory='" + memory + '\'' +
                ", type='" + type + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", status=" + status +
                '}';
    }
}
