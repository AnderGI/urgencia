package com.andergi.javadddtemplate.src.shared.infrastructure.faker;

import com.github.javafaker.Faker;

public final class FakerTextObjectMother {

    private static Faker faker = new Faker();

    public static String create(final Integer min, final Integer max) {
        return faker.lorem().characters(min, max);
    }


}
