package ru.northarea.nexus;

import java.util.List;

public interface NexusExtractor<E, T> {
    List<E> fetch(List<T> list);
}
