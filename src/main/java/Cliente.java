import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nombre;
	String apellido1;
	String apellido2;
	String tipoDoc;
	String numeroDoc;
	int telFijo;
	long telCel;
	String direccion;
	List<Cliente> listaClientes = new ArrayList<Cliente>(); // al de

	public Cliente() {
	}

	public void llenarListaClientes() {//metodo que llena la lista

		listaClientes.add(new Cliente("Paulina", "Rios", "Ramirez", "c", "1021", 2302501, 310102030, "Cl 10 20 30"));
		listaClientes.add(new Cliente("Valentina", "Rios", "Ramirez", "c", "1022", 2602001, 310108010, "cl 42 30"));
		listaClientes.add(new Cliente("Nicolás", "Estrada", "Rios", "c", "102333", 4406001, 311105503, "Cl 63C 96A"));
		listaClientes.add(new Cliente("Manuela", "Muñoz", "Meneses", "c", "102543", 2302501, 300102880, "Cl 64 80"));

	}

	public Cliente(String nombre, String apellido1, String apellido2, String tipoDoc, String numeroDoc, int telFijo,
			long telCel, String direccion) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.telFijo = telFijo;
		this.telCel = telCel;
		this.direccion = direccion;
	}

	public Cliente(String nombre, String numeroDoc) {
		this.nombre = nombre;
		this.numeroDoc = numeroDoc;
	}

}
