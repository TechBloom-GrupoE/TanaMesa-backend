package com.techbloom.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techbloom.delivery.model.Produto;
import com.techbloom.delivery.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping // listar todos os produtos
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	@GetMapping("/{id}") // listar por id
    public ResponseEntity<Produto> getById(@PathVariable Long id){
        return produtoRepository.findById(id) 
                .map(resposta -> ResponseEntity.ok(resposta))
                .orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}") // listar por nome
	    public ResponseEntity<List<Produto>> getAllByNome(@PathVariable String nome){
	        return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
	    }
	

}
