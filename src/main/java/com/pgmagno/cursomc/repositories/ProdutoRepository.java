package com.pgmagno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgmagno.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
