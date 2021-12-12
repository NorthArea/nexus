package ru.northarea.nexus;

import ru.northarea.nexus.exception.NexusException;

public interface Nexus<E> {
    void setProducer(NexusProducer<E> producer);

    void setExtractor(NexusExtractor<E> extractor);

    void handle() throws NexusException;
}
