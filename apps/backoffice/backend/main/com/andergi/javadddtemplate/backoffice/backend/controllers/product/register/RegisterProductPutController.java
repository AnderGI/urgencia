package com.andergi.javadddtemplate.backoffice.backend.controllers.product.register;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
final public class RegisterProductPutController {

    @PutMapping(path = "/products/{uuid}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void run(final @PathVariable  String uuid, final @RequestBody RegisterProductRequest request) {

    }

}
