package Modelo;

import java.util.*;

import Modelo.Medicion;

public class Cliente {
	private Integer nroCliente;
	private String calle;
	private Integer altura;
	private Integer piso;
	private String departamento;
	private String codigoPostal;
	private String localidad;
	private String provincia;
	private Collection<Medicion> mediciones;
	protected String isA;
	
	public Cliente(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia) {
		this.nroCliente = nroCliente;
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;	
	}
	public Integer getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public  String getIsA(){
		return this.isA;
	}
	
}
