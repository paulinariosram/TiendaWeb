import java.util.List;


public interface ProductoInterface {

	public Productos buscarProductos(List<Productos>listaProductos, String referencia);
	
	public List<Productos> cambiarStockProductos(List<Productos>listaProductos, String referencia, int stock);
}
