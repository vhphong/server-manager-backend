package com.projects.servermanager.repositories;

import com.projects.servermanager.models.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipaddress);
}
