package com.acastro.microservicios.app.productos.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_comprar_det")
public class ListaCompraDetalle {

	@Id
	private Long idListaCompraDet;
	private Long codigoProducto;
	private ListaCompra idListaCompra;
	private Producto idCodigoProducto;
	private Long cantidad;
	
	public Long getIdListaCompraDet() {
		return idListaCompraDet;
	}
	public void setIdListaCompraDet(Long idListaCompraDet) {
		this.idListaCompraDet = idListaCompraDet;
	}
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public ListaCompra getIdListaCompra() {
		return idListaCompra;
	}
	public void setIdListaCompra(ListaCompra idListaCompra) {
		this.idListaCompra = idListaCompra;
	}
	public Producto getIdCodigoProducto() {
		return idCodigoProducto;
	}
	public void setIdCodigoProducto(Producto idCodigoProducto) {
		this.idCodigoProducto = idCodigoProducto;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
