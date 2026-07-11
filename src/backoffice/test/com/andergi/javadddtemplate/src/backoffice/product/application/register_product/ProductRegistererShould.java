package com.andergi.javadddtemplate.src.backoffice.product.application.register_product;


import com.andergi.javadddtemplate.src.backoffice.product.domain.Product;
import com.andergi.javadddtemplate.src.backoffice.product.domain.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class ProductRegistererShould {

    @Test
    void register_a_valid_product() throws Exception {
        final ProductRepository mock = Mockito.mock(ProductRepository.class);
        final ProductRegisterer registerer = new ProductRegisterer(mock);
        final Product product = new Product("b68f309b-26b9-4007-b1f6-1a3f9237e1a4", "fake-description");
        final RegisterProductCommand command = new RegisterProductCommand(product.id(), product.description());

        registerer.register(command);

        verify(mock, times(1)).save(product);
    }

}