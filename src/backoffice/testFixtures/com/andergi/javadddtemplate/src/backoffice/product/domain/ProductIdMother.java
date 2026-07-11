package com.andergi.javadddtemplate.src.backoffice.product.domain;


import com.andergi.javadddtemplate.src.shared.infrastructure.faker.FakerUuidObjectMother;

public final class ProductIdMother {
    public static ProductId create(final String id) {
        return new ProductId(id);
    }

    public static ProductId random() {
        return new ProductId(FakerUuidObjectMother.random());
    }

    public static ProductId invalid() {
        return new ProductId(FakerUuidObjectMother.invalid());
    }

}
