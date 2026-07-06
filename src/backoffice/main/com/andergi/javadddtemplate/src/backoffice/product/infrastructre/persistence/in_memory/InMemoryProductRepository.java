package com.andergi.javadddtemplate.src.backoffice.product.infrastructre.persistence.in_memory;

import com.andergi.javadddtemplate.src.backoffice.product.domain.Product;
import com.andergi.javadddtemplate.src.backoffice.product.domain.ProductRepository;
import com.andergi.javadddtemplate.src.shared.infrastructure.spring.annotations.Service;

import java.util.HashMap;

@Service
public final class InMemoryProductRepository implements ProductRepository {

    private static final HashMap<String, Product> database = new HashMap<>();

    @Override
    public void save(final Product product) {
        database.put(product.id(), product);
    }
}
