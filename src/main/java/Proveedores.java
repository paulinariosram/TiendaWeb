import java.util.ArrayList;
import java.util.List;

public class Proveedores {

	String nombre;
	String tipoDoc;
	String numeroDoc;
	String direccion;
	int telFijo;
	int telMovil;
	List<Proveedores> listaProveedores = new ArrayList<Proveedores>();

	public Proveedores() {

	}

	public void llenarListaProveedores() {
		listaProveedores.add(new Proveedores("Bimbo", "N", "800200300", "Cr 65 96", 2571777, 300200500));
		listaProveedores.add(new Proveedores("Ramo", "N", "800200400", "Cr 70 80", 2571020, 300200600));
		listaProveedores.add(new Proveedores("Colanta", "N", "800200500", "Cr 40 70", 2572030, 300500500));
		listaProveedores.add(new Proveedores("Pilsen", "N", "800200600", "Cr 50 50", 25050407, 300200200));
		listaProveedores.add(new Proveedores("FLA", "N", "800200700", "Cl 80 80", 2517799, 300300300));
	}

	public void entregarProd() {
	}

	public void recibirProd() {
	}

	public void RecibePago() {
	}

	public void devuelvePago() {
	}

	public Proveedores(String nombre, String tipoDoc, String numeroDoc, String direccion, int telFijo, int telMovil) {
		this.nombre = nombre;
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.direccion = direccion;
		this.telFijo = telFijo;
		this.telMovil = telMovil;
	}

}
