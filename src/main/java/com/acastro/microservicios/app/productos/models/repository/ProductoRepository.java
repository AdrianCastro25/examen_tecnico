package com.acastro.microservicios.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.acastro.microservicios.app.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
