package com.andergi.javadddtemplate.backoffice.backend.controllers.product.register;

import com.andergi.javadddtemplate.src.backoffice.product.application.register_product.ProductRegisterer;
import com.andergi.javadddtemplate.src.backoffice.product.application.register_product.RegisterProductCommand;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
final public class RegisterProductPutController {

    private final ProductRegisterer registerer;

    public RegisterProductPutController(final ProductRegisterer registerer) {
        this.registerer = registerer;
    }

    @PutMapping(path = "/products/{uuid}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void run(final @PathVariable  String uuid, final @RequestBody RegisterProductRequest request) {
        this.registerer.register(new RegisterProductCommand(uuid, request.description()));
    }

}
