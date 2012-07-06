package Modelo;
import Persistencia.AdmPersistenciaCliente;

public class Residencial extends Cliente{
	private String nombre;
	private String apellido;
	
	public Residencial(String calle, Integer altura,
			Integer piso, String departamento, String codigoPostal,
			String localidad, String provincia, String nombre, String apellido) {
		super(calle, altura, piso, departamento, codigoPostal,
				localidad, provincia);
		this.nombre = nombre;
		this.apellido = apellido;
		super.setIsA("residencial");
		AdmPersistenciaCliente adm = AdmPersistenciaCliente.getInstancia();
		adm.altaCliente(this);
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
	public ResidencialView generarView(){
		ResidencialView cli = new ResidencialView(nroCliente, calle, altura, piso, departamento, codigoPostal, localidad, provincia, isA, nombre, apellido);
		return cli;
	}
}
