package com.acastro.microservicios.app.productos.models.service;

import java.util.List;

import com.acastro.microservicios.app.productos.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void deleteById(Long id);
}
