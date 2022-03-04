import java.util.List;

public interface ProveedoresInterface {

	 boolean existeProveedoresLista(List<Proveedores> listaProveedores, String numeroDoc);
	Proveedores buscarProveedores(List<Proveedores> listaProveedores, String numeroDoc);
	
	
}
