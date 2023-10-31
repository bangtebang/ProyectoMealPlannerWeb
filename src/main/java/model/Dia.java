package model;
import java.util.Date;

public class Dia {
	private String nombre;
	private Date fecha;
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Dia(String nombre, Date fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
}