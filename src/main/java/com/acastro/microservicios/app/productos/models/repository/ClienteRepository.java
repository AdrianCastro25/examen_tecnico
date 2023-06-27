package com.acastro.microservicios.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.acastro.microservicios.app.productos.models.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
