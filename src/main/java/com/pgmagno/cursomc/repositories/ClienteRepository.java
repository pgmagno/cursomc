package com.pgmagno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgmagno.cursomc.domain.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}


