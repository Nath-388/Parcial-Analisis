import java.util.ArrayList;
import java.util.List;

class Articulo {
	private String nombre;
	private int cantidad;
	private boolean comprado;

	public Articulo(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.comprado = false;
	}

	public void filtrarComprados() {

		this.comprado = true;
	}

	public boolean isComprado() {
		return comprado;
	}

	@Override
	public String toString() {
		return nombre + " (Cantidad: " + cantidad + ")";
	}
}

class listaCompras {
	private List<Articulo> listaCompras = new ArrayList<>();

	public void filtrarArticulosComprados(String nombre) {
		
		for (Articulo articulo : listaCompras) {
			if(articulo.toString().contains(nombre)) {
				
				articulo.filtrarComprados();
				System.out.println("Articulo filtrado por comprado: " + articulo);
				return;
			}
		}
	}

	public void agregarArticulo(String nombre, int cantidad) {
		Articulo nuevoArticulo = new Articulo(nombre, cantidad);
		listaCompras.add(nuevoArticulo);
		System.out.println("Articulo agregado: " + nuevoArticulo);
	}

	public void mostrarLista() {
		System.out.println("Lista de Compras:");
		for (Articulo articulo : listaCompras) {
			System.out.println("- " + articulo);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		listaCompras lista = new listaCompras();
		lista.agregarArticulo("Manzanas", 4);
		lista.agregarArticulo("Pan", 1);
		lista.mostrarLista();
	}
}