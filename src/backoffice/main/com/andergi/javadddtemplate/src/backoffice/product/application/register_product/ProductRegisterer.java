package com.andergi.javadddtemplate.src.backoffice.product.application.register_product;

import com.andergi.javadddtemplate.src.backoffice.product.domain.Product;
import com.andergi.javadddtemplate.src.backoffice.product.domain.ProductRepository;
import com.andergi.javadddtemplate.src.shared.infrastructure.spring.annotations.Service;

@Service
public final class ProductRegisterer {

    private final ProductRepository repository;

    public ProductRegisterer(final ProductRepository repository) {
        this.repository = repository;
    }

    public void register(final RegisterProductCommand command) {
        final Product product = new Product(command.id(), command.description());
        repository.save(product);
    }

}
