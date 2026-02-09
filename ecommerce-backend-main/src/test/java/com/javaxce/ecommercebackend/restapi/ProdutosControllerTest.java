package com.javaxce.ecommercebackend.restapi;

import com.javaxce.ecommercebackend.persistence.ProdutosRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ProdutosControllerTest {

    @Mock
    private ProdutosRepository produtosRepository;
    private ProdutosController produtosController = new ProdutosController();

    @Test
    public void testIt() {
        this.produtosController.getProdutos();
    }
}
