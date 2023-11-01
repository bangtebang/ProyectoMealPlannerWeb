package controller;

import model.Alimento;
import model.Usuario;
import model.Dia;

import java.util.ArrayList;
import java.util.List;

public class GestorMealPlanner {
	private List<Alimento> alimentos = new ArrayList<>();
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Dia> dias = new ArrayList<>();

	public void agregarAlimento(Alimento alimento) {
		alimentos.add(alimento);
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void agregarDia(Dia dia) {
		dias.add(dia);
	}

	public Alimento buscarAlimento(String nombre) {
		for (Alimento alimento : alimentos) {
			if (alimento.getNombre().equalsIgnoreCase(nombre)) {
				return alimento;
			}
		}
		return null;
	}

	public void eliminarAlimento(String nombre) {
		Alimento alimentoAEliminar = null;
		for (Alimento alimento : alimentos) {
			if (alimento.getNombre().equalsIgnoreCase(nombre)) {
				alimentoAEliminar = alimento;
				break;
			}
		}
		if (alimentoAEliminar != null) {
			alimentos.remove(alimentoAEliminar);
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Dia> getDias() {
		return dias;
	}
}