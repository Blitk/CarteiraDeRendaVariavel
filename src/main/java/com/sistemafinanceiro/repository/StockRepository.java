package com.sistemafinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemafinanceiro.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
