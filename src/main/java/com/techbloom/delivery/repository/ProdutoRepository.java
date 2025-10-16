package com.techbloom.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techbloom.delivery.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome); //Query Methods
	

}
