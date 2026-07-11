package com.andergi.javadddtemplate.src.backoffice.product.domain;

import com.andergi.javadddtemplate.src.shared.domain.value_objects.StringValueObject;

public class ProductDescription extends StringValueObject {

    public ProductDescription(final String value) throws InvalidProductDescriptionException {
        super(value);
        ensureIsValidDescription(value);
    }

    private void ensureIsValidDescription(final String value) throws InvalidProductDescriptionException {
        final boolean isBlank = value.isBlank();
        if(isBlank) throw new InvalidProductDescriptionException("Product should have a non blank description");

        final boolean hasCorrectLenght = value.length() > 10 && value.length() < 50;
        if(!hasCorrectLenght) throw new InvalidProductDescriptionException("Products description length should be between 10 and 50 characters");
    }
}
