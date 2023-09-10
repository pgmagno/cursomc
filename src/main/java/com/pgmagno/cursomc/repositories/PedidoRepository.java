package com.pgmagno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgmagno.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
}
