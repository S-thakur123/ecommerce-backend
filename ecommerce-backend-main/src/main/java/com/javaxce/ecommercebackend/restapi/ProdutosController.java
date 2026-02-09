package com.javaxce.ecommercebackend.restapi;

import com.javaxce.ecommercebackend.persistence.Produto;
import com.javaxce.ecommercebackend.persistence.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    private ProdutosRepository produtosRepository;

    public ProdutosController(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    @GetMapping
    public List<Produto> getProdutos() {
        this.produtosRepository.findByNameAsc("bike");
        return this.produtosRepository.findAll();
    }

    @GetMapping("/{produtoId}")
    public String getProduto(@PathVariable Integer produtoId) {
        return "Produto: " + produtoId;
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return this.produtosRepository.save(produto);
    }

}
