package com.andergi.javadddtemplate.backoffice.backend.controllers.product.register;

import com.andergi.javadddtemplate.backoffice.backend.ApplicationTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

final class RegisterProductPutControllerShould extends ApplicationTestCase {
    @Test
    void register_a_valid_product() throws Exception {
        this.assertRequestWithBody(HttpMethod.PUT.name(), "/products/2967528a-56ed-4c1e-9341-691b2ac3f98f",
                "{\"description\": \"This is a valid description for a valid product\"}", HttpStatus.ACCEPTED.value());
    }
}