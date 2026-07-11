package com.andergi.javadddtemplate.src.backoffice.product.domain;

import com.andergi.javadddtemplate.src.shared.infrastructure.faker.FakerRandomIntegerMother;
import com.andergi.javadddtemplate.src.shared.infrastructure.faker.FakerTextObjectMother;

// TODO this kind of business logic should not be placed as magic variables
public final class ProductDescriptionMother {

    public static ProductDescription valid() {
        return new ProductDescription(FakerTextObjectMother.create(10, 50));
    }

    public static ProductDescription lessThanTenCharactes() {
        return new ProductDescription(FakerTextObjectMother.create(0, 9));
    }

    public static ProductDescription moreThanFiftyCharactes() {
        return new ProductDescription(FakerTextObjectMother.create(51, FakerRandomIntegerMother.from(51)));
    }

    public static ProductDescription empty() {
        return new ProductDescription("");
    }
}

