package com.example.gestaoPedidos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestaoPedidos.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
