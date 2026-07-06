package com.andergi.javadddtemplate.src.backoffice.product.domain;

import java.util.Objects;

public final class Product {
    private final String id;
    private final String description;

    public Product(final String id, final String description) {
        this.id = id;
        this.description = description;
    }

    public String id() {
        return this.id;
    }

    public String description() {
        return this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
