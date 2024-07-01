package com.example.gestaoPedidos.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestaoPedidos.entity.Produto;
import com.example.gestaoPedidos.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository productRepository;

    public List<Produto> getAllProdutos() {
        return productRepository.findAll();
    }

    public Optional<Produto> getProdutoById(Long id) {
        return productRepository.findById(id);
    }

    public Produto saveProduto(Produto produto) {
        return productRepository.save(produto);
    }

    public void deleteProduto(Long id) {
        productRepository.deleteById(id);
    }
}
