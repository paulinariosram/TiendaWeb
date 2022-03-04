import java.util.List;

public class ProductoImplemInterface implements ProductoInterface {

	
	public Productos buscarProductos(List<Productos>listaProductos, String referencia) {

		for (Productos contadorProductos : listaProductos) {
			
			if (contadorProductos.referencia.equals(referencia)) {
				return contadorProductos;
			}}
		return null;
	}
	
	public List<Productos> cambiarStockProductos(List<Productos>listaProductos, String referencia, int stock) {
		for (Productos contadorProductos : listaProductos) {
			if(contadorProductos.referencia.equals(referencia)) {
				contadorProductos.stock = contadorProductos.stock - stock;
					return listaProductos;
			}
			}
		return null;
	}
}
