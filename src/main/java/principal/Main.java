package principal;

import controller.GestorMealPlanner;
import model.Alimento;
import model.Usuario;
import model.Dia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		GestorMealPlanner gestor = new GestorMealPlanner();

		Alimento alimento1 = new Alimento("Manzana", 52.0, 100.0, 0.26, 14.0, 9.8, 1.0, 2.4, true);
		Alimento alimento2 = new Alimento("Pollo", 165.0, 100.0, 31.0, 0.0, 0.0, 74.0, 0.0, false);
		Usuario usuario1 = new Usuario("Juan", "Pérez", "juan@example.com", "password123", "123456789");
		Usuario usuario2 = new Usuario("Maria", "González", "maria@example.com", "password456", "987654321");
		Date today = new Date();
		Dia dia1 = new Dia("Martes", today);

		gestor.agregarAlimento(alimento1);
		gestor.agregarAlimento(alimento2);
		gestor.agregarUsuario(usuario1);
		gestor.agregarUsuario(usuario2);
		gestor.agregarDia(dia1);

		Alimento encontrado = gestor.buscarAlimento("Manzana");
		if (encontrado != null) {
			System.out.println("Alimento encontrado: " + encontrado.getNombre());
		} else {
			System.out.println("Alimento no encontrado.");
		}

		gestor.eliminarAlimento("Pollo");

		System.out.println("Usuarios registrados:");
		for (Usuario usuario : gestor.getUsuarios()) {
			System.out.println("Nombre: " + usuario.getNombre() + ", Apellido: " + usuario.getApellido());
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Días registrados:");
		for (Dia dia : gestor.getDias()) {
			System.out.println("Nombre: " + dia.getNombre() + ", Fecha: " + dateFormat.format(dia.getFecha()));
		}
	}
}