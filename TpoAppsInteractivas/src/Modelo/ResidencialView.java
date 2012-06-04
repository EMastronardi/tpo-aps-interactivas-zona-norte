package Modelo;

public class ResidencialView {

	private Integer nroCliente;
	private String calle;
	private Integer altura;
	private Integer piso;
	private String departamento;
	private String codigoPostal;
	private String localidad;
	private String provincia;
	private String isA;
	private String nombre;
	private String apellido;
	
	public ResidencialView(Integer nroCliente, String calle,
			Integer altura, Integer piso, String departamento,
			String codigoPostal, String localidad, String provincia,
			String isA, String nombre, String apellido) {
		this.nroCliente = nroCliente;
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.isA = isA;
		this.nombre = nombre;
		this.apellido = apellido;
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
	public String getIsA() {
		return isA;
	}
	public void setIsA(String isA) {
		this.isA = isA;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//Necesario para los combos
	public String toString(){
		return getNombre() + ", " + getApellido();
	}
	
}
