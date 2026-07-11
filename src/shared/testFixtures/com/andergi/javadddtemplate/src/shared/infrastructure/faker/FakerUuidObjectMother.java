package com.andergi.javadddtemplate.src.shared.infrastructure.faker;

import com.github.javafaker.Faker;

public final class FakerUuidObjectMother {
    private static Faker faker = new Faker();

    public static String random() {
        return faker.internet().uuid();
    }

    // In order to invalidate uuids but ensuring it keeps its appearance I have to break the regex uuids have of hexadecimal values of fix length, 8-4-4-4-12, separated by hyphens
    public static String invalid() {
        return faker.random().nextBoolean() ? noHexadecimalChars() : invalidBlockLength();
    }

    private static String noHexadecimalChars() {
        return faker.regexify("[g-z]{8}-[g-z]{4}-[g-z]{4}-[g-z]{4}-[g-z]{12}");
    }

    // this methods fails at making ProductId value object throw an exception
    // the reason behind it is its implementation
    // this methods generates strings with more than 36 characters breaking UUID.fromString() and fromString1() implementations
    private static String invalidBlockLength() {
        return faker.regexify("[a-f0-9]{9}-[a-f0-9]{5}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}");
    }

}
