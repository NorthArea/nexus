package ru.northarea.nexus;

import ru.northarea.nexus.exception.NexusProducerException;

public interface NexusProducer<E> {
    void send(String topic, E message) throws NexusProducerException;
}
