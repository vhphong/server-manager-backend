package com.projects.servermanager.services;

import com.projects.servermanager.models.Server;

import java.util.Collection;

public interface ServerService {
    Server createServer(Server server);

    Server pingServer(String ipAddress);

    Collection<Server> listOfServerInLimit(int limit);

    Server getServerById(Long id);

    Server updateServer(Server server);

    Boolean deleteServerById(Long id);
}
