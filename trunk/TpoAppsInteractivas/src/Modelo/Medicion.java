package Modelo;
import java.util.Date;


public class Medicion {
	private Date fecha;
	private float valor;
	
	public Medicion(Date fecha, float valor) {
		this.fecha = fecha;
		this.valor = valor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
}
