package com.andergi.javadddtemplate.src.shared.infrastructure.faker;

import com.github.javafaker.Faker;

public class FakerRandomIntegerMother {
    private static Faker faker = new Faker();

    public static Integer between(final Integer min, final Integer max) {
        return faker.number().numberBetween(min, max);
    }

    public static Integer from(final Integer from) {
        return FakerRandomIntegerMother.between(from, 1000000);
    }

}