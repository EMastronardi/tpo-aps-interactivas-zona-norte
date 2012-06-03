package Modelo;

import java.util.*;
import Modelo.Cliente;
import Modelo.ItemFactura;

public class Factura {
	private Integer nroFactura;
	private float metrosCubicosConsumidos;
	private Date fecha;
	private Cliente cliente;
	private float valorTotal;
	private ArrayList<ItemFactura> Items;
	
	public Factura(float metrosCubicosConsumidos, Cliente cliente) {
		this.metrosCubicosConsumidos = metrosCubicosConsumidos;
		this.cliente = cliente;
	}
	
	public Integer getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(Integer nroFactura) {
		this.nroFactura = nroFactura;
	}
	public float getMetrosCubicosConsumidos() {
		return metrosCubicosConsumidos;
	}
	public void setMetrosCubicosConsumidos(float metrosCubicosConsumidos) {
		this.metrosCubicosConsumidos = metrosCubicosConsumidos;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<ItemFactura> getItems() {
		return Items;
	}
	public void setItems(ArrayList<ItemFactura> items) {
		Items = items;
	}
}
