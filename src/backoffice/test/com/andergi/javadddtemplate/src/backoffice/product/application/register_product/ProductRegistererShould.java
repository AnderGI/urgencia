package com.andergi.javadddtemplate.src.backoffice.product.application.register_product;


import com.andergi.javadddtemplate.src.backoffice.product.domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class ProductRegistererShould {

    @Test
    void register_a_valid_product() throws Exception {
        final ProductRepository mock = Mockito.mock(ProductRepository.class);
        final ProductRegisterer registerer = new ProductRegisterer(mock);
        final Product product = ProductObjectMother.valid();
        final RegisterProductCommand command = new RegisterProductCommand(product.id(), product.description());

        registerer.register(command);

        verify(mock, times(1)).save(product);
    }

    @Test
    void not_register_a_product_with_invalid_uuid() throws Exception {
        final ProductRepository mock = Mockito.mock(ProductRepository.class);
        final ProductRegisterer registerer = new ProductRegisterer(mock);

        assertThrows(IllegalArgumentException.class, () -> registerer.register(new RegisterProductCommand(ProductIdMother.invalid().value(), ProductDescriptionMother.valid().value())));
    }

    @Test
    void not_register_a_product_when_description_is_empty() throws Exception {
        final ProductRepository mock = Mockito.mock(ProductRepository.class);
        final ProductRegisterer registerer = new ProductRegisterer(mock);

        assertThrows(InvalidProductDescriptionException.class, () -> registerer.register(new RegisterProductCommand(ProductIdMother.random().value(), ProductDescriptionMother.empty().value())));
    }

    @Test
    void not_register_a_product_with_a_description_of_less_than_ten_chars() throws Exception {
        final ProductRepository mock = Mockito.mock(ProductRepository.class);
        final ProductRegisterer registerer = new ProductRegisterer(mock);

        assertThrows(InvalidProductDescriptionException.class, () -> registerer.register(new RegisterProductCommand(ProductIdMother.random().value(), ProductDescriptionMother.lessThanTenCharactes().value())));
    }

    @Test
    void not_register_a_product_with_a_description_of_more_than_fifty_chars() throws Exception {
        final ProductRepository mock = Mockito.mock(ProductRepository.class);
        final ProductRegisterer registerer = new ProductRegisterer(mock);

        assertThrows(InvalidProductDescriptionException.class, () -> registerer.register(new RegisterProductCommand(ProductIdMother.random().value(), ProductDescriptionMother.moreThanFiftyCharactes().value())));
    }

}