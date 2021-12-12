package ru.northarea.nexus;

import java.util.List;

public interface NexusObserver<T> {
    List<T> getChangelog(String entity);
}
