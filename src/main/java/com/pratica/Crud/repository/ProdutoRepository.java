package com.pratica.Crud.repository;

import com.pratica.Crud.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Product, String> {
}
