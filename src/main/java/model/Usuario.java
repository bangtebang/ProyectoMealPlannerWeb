package model;

import model.Alimento;
import controller.GestorMealPlanner;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasenia;
	private String rut;
	private Alimento alimento;
	public GestorMealPlanner unnamed_GestorMealPlanner_;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public boolean registrarUsuario() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Usuario> obtenerUsuario() {
		throw new UnsupportedOperationException();
	}
	public Usuario(String nombre, String apellido, String correo, String contrasenia, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.rut = rut;
	}
}