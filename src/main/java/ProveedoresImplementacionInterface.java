import java.util.List;

public class ProveedoresImplementacionInterface implements ProveedoresInterface {

	public boolean existeProveedoresLista(List<Proveedores> listaProveedores, String numeroDoc) {
	
	for(Proveedores iteradorProveedores : listaProveedores) {
		if(numeroDoc.equals(iteradorProveedores.numeroDoc)) {
		return true;
	}
}

return false;
	}

	public Proveedores buscarProveedores(List<Proveedores> listaProveedores, String numeroDoc) {
		boolean existeProveedores = existeProveedoresLista(listaProveedores,  numeroDoc);
		if (existeProveedores) {
			for(Proveedores iteradorProveedores:listaProveedores) {
				if (numeroDoc.equals(iteradorProveedores.numeroDoc)) {
				return iteradorProveedores;
			}
			
		}
		
	}else {System.out.print("El proveedor ingresado no existe ");
	return null;
	}
		return null;
	}

}
