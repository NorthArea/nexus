package ru.northarea.nexus;

import ru.northarea.nexus.exception.NexusProducerException;

public interface NexusProducer<K, V> {
    void send(K key, V value) throws NexusProducerException;
}
