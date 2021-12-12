package ru.northarea.nexus;

import java.util.List;

public interface NexusExtractor<E> {
    List<E> fetch();
}
