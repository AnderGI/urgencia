package com.andergi.javadddtemplate.src.backoffice.product.domain;

public class InvalidProductDescriptionException extends RuntimeException {
    public InvalidProductDescriptionException(String message) {
        super(message);
    }
}
