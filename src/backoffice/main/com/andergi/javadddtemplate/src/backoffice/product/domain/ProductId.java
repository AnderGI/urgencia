package com.andergi.javadddtemplate.src.backoffice.product.domain;

import com.andergi.javadddtemplate.src.shared.domain.value_objects.UuidValueObject;

public final class ProductId extends UuidValueObject {
    public ProductId(String value) throws IllegalArgumentException {
        super(value);
    }


}
