package com.andergi.javadddtemplate.src.shared.domain.value_objects;

import java.util.Objects;
import java.util.UUID;

public class UuidValueObject extends StringValueObject {

    public UuidValueObject(final String value) throws IllegalArgumentException {
        super(value);
        this.ensureValidUuid(value);
    }

    private void ensureValidUuid(final String id) throws IllegalArgumentException{
        UUID.fromString(id);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UuidValueObject uuid = (UuidValueObject) o;
        return Objects.equals(uuid.value(), ((UuidValueObject) o).value());
    }
}