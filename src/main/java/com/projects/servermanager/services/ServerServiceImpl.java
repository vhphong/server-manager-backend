package com.projects.servermanager.services;

import com.projects.servermanager.models.Server;
import com.projects.servermanager.repositories.ServerRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.logging.Logger;

@Service
@Transactional
public class ServerServiceImpl implements ServerService {

    private final ServerRepo serverRepo;

    Logger logger = Logger.getLogger("Information logging");


    public ServerServiceImpl(ServerRepo serverRepo) {
        this.serverRepo = serverRepo;
    }


    @Override
    public Server createServer(Server server) {
        logger.info("Saving new server: " + server.getName());
        server.setImageUrl(setServerImageUrl());
        return serverRepo.save(server);
    }


    @Override
    public Server pingServer(String ipAddress) {
        return null;
    }


    @Override
    public Collection<Server> listOfServerInLimit(int limit) {
        return null;
    }


    @Override
    public Server getServerById(Long id) {
        return null;
    }


    @Override
    public Server updateServer(Server server) {
        return null;
    }


    @Override
    public Boolean deleteServerById(Long id) {
        return null;
    }


    public String setServerImageUrl() {
        return null;
    }
}
