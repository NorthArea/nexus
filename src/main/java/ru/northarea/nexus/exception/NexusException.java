package ru.northarea.nexus.exception;

public class NexusException extends RuntimeException{
    public NexusException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
