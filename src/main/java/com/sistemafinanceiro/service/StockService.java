package com.sistemafinanceiro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemafinanceiro.model.Stock;
import com.sistemafinanceiro.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository repository;
	
	public List<Stock> listarTodos(){
		return repository.findAll();
	}
	
	public Stock salvar(Stock stock) {
		return repository.save(stock);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	
	public Stock alterar(Long id, Stock stock) {
		if(repository.existsById(id)) {
			stock.setId(id);
			return repository.save(stock);
		}else {
			throw new RuntimeException("Stock not Find");
		}
		
	}
	
	
	public Optional<Stock> findById(Long id){
		return repository.findById(id);
	}
}
