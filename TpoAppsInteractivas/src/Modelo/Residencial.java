package Modelo;

public class Residencial extends Cliente{
	private String nombre;
	private String apellido;
	
	
	public Residencial(Integer nroCliente, String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String nombre, String apellido) {
		super(nroCliente, calle, altura, piso, departamento, codigoPostal,
				localidad, provincia);
		this.nombre = nombre;
		this.apellido = apellido;
		super.isA="residencial";	
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
	
}
