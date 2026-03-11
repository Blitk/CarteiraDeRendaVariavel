package com.sistemafinanceiro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemafinanceiro.model.Stock;
import com.sistemafinanceiro.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {
	
	
	@Autowired
	private StockService service;
	
	@GetMapping
	public List<Stock> listarTodos(){
		return service.listarTodos();
	}
	
	@PostMapping
	public Stock salvar(@RequestBody Stock stock) {
		return service.salvar(stock);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Stock> findById(@PathVariable Long id){
		return service.findById(id);
	}
}
