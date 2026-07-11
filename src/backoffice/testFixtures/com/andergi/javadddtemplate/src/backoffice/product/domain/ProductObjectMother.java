package com.andergi.javadddtemplate.src.backoffice.product.domain;

public final class ProductObjectMother {
    public static Product create(final String id, final String description) {
        return new Product(id, description);
    }

    public static Product valid() {
        return new Product(ProductIdMother.random().value(), ProductDescriptionMother.valid().value());
    }
}
