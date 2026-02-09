package com.javaxce.ecommercebackend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ProdutosRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByNameAsc(String name);
}
