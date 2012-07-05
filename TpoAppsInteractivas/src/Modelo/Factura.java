package Modelo;

import java.util.*;
import Modelo.Cliente;
import Modelo.ItemFactura;
import Persistencia.AdmPersistenciaFactura;

public class Factura {
	private Integer nroFactura;
	private float metrosCubicosConsumidos;
	private Date fecha;
	private Cliente cliente;
	private ArrayList<ItemFactura> Items;
	
	public Factura(Integer nrofact, Cliente cliente, ArrayList<Liquidador> liquidadores) {
		this.nroFactura = nrofact;
		this.fecha = new Date();
		this.metrosCubicosConsumidos = cliente.obtenerUltimoConsumo();
		this.cliente = cliente;
		this.Items = this.generarFactura(this.cliente, liquidadores);
		AdmPersistenciaFactura.getInstancia().insert(this);
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
	public ArrayList<ItemFactura> getItems() {
		return Items;
	}
	public void setItems(ArrayList<ItemFactura> items) {
		Items = items;
	}
	private ArrayList<ItemFactura> generarFactura(Cliente cli, ArrayList<Liquidador> liquidadores ){
		
		boolean seguir = true;
		int i = 0;
		ArrayList<ItemFactura> iFact = null;
		while(seguir){
			
			iFact = liquidadores.get(i).liquidar(cli.getIsA(), cli.obtenerUltimoConsumo());
			if(iFact != null){
				seguir = false;
				
			}
			i++;
		}
		return iFact;
	}
	public float getValorTotal(){
		float total = 0;
		for(ItemFactura itm : this.Items){
			total = total + itm.getValor();
		}
		return total;
	}
}

