package Modelo;

import java.util.*;
import Modelo.Medicion;

public class Industrial extends Cliente{
	private String razonSocial;
	private String cuit;
	private String ingresosBrutos;
	private String Categoria;
	
	public Industrial(String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String razonSocial,
			String cuit, String ingresosBrutos, String categoria) {
		super(calle, altura, piso, departamento, codigoPostal,
				localidad, provincia);
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.ingresosBrutos = ingresosBrutos;
		Categoria = categoria;
		super.isA="industrial";
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getIngresosBrutos() {
		return ingresosBrutos;
	}
	public void setIngresosBrutos(String ingresosBrutos) {
		this.ingresosBrutos = ingresosBrutos;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
}
