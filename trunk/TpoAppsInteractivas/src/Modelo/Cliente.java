package Modelo;

import java.util.*;

import Modelo.Medicion;

public abstract class Cliente {
	
	protected Integer nroCliente;
	protected String calle;
	protected Integer altura;
	protected Integer piso;
	protected String departamento;
	protected String codigoPostal;
	protected String localidad;
	protected String provincia;
	private ArrayList<Medicion> mediciones;
	protected String isA;
	private static int nroProximoCliente = 0;
	
	
	public void setIsA(String isA) {
		this.isA = isA;
	}

	public Cliente(String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.mediciones = new ArrayList<Medicion>();
		this.nroCliente = this.generarIdCliente();
	}
	
	private static int generarIdCliente(){
		nroProximoCliente +=1;
		return nroProximoCliente;
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
	public boolean cargarMedicion(float valor, Date fecha){
		if(this.mediciones.add(new Medicion(fecha, valor)))
			return true;
		else
			return false;
	}
	public  String getIsA(){
		return this.isA;
	}
	public float obtenerUltimoConsumo(){
		Medicion ultima = mediciones.get(mediciones.size()-1);
		Medicion anterior = mediciones.get(mediciones.size()-2);
		float consumo = ultima.getValor() - anterior.getValor();
		return  consumo;
	}
	
}
