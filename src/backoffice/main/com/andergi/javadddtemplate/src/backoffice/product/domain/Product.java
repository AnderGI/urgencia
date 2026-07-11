package com.andergi.javadddtemplate.src.backoffice.product.domain;

import java.util.Objects;

public final class Product {
    private final ProductId id;
    private final ProductDescription description;

    public Product(final String id, final String description) {
        this.id = new ProductId(id);
        this.description = new ProductDescription(description);
    }

    public String id() {
        return this.id.value();
    }

    public String description() {
        return this.description.value();
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
