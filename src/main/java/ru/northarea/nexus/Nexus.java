package ru.northarea.nexus;

import ru.northarea.nexus.exception.NexusException;

public interface Nexus {
    void handle() throws NexusException;
}
