import java.util.ArrayList;
import java.util.List;

public class Productos {

	String nombre;
	String referencia;
	int peso;
	String marca;
	int stock;
	int precio;
	List<Productos> listaProductos = new ArrayList<Productos>();

	public Productos() {}
	
	public void llenarListaProductos() {// iniciarListaProductos es la que llena esta informacion
		
		listaProductos.add(new Productos("Arroz","10304050",1000,"Diana",10,2780));
		listaProductos.add(new Productos("lentejas","10304088",1000,"econo",15,2750));
		listaProductos.add(new Productos("chocorramo","10304099",300,"Ramo",5,8300));
		listaProductos.add(new Productos("browni","10304095",400,"Bimbo",9,10400));
		listaProductos.add(new Productos("leche deslactosada","10304333",1000,"colanta",11,3000));
		listaProductos.add(new Productos("Quesito","10304338",1000,"Alqueria",4,3500));
		
	}
		
	public Productos(String nombre, String referencia, int peso, String marca, int stock, int precio) {
		this.nombre = nombre;
		this.referencia = referencia;
		this.peso = peso;
		this.marca = marca;
		this.stock = stock;
		this.precio = precio;
	}
	
	
	public void ingresanInventario() {
	}

	public void sacanInventario() {
	}

	public void eligen() {
	}

	public void pagan() {
	}

	public void devuelven() {
	}

	public void dañan() {
	}

	public void roban() {
	}

	
	
}
