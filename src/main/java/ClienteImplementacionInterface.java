import java.util.List;

public class ClienteImplementacionInterface implements ClienteInterface{

	
	public boolean existeClienteLista(List<Cliente>listaClientes,String numeroDoc) {
		
		for (Cliente iteradorCliente : listaClientes) {
			if (numeroDoc.equals(iteradorCliente.numeroDoc)) {
					return true;
				}
			}
		
		return false;
	}
	public Cliente buscarListaClientes(List<Cliente> listaClientes,String numeroDoc) {
		boolean existeCliente = existeClienteLista(listaClientes,numeroDoc);
		if (existeCliente) {
			for (Cliente iteradorCliente :listaClientes) {
				if (numeroDoc.equals(iteradorCliente.numeroDoc)) {
					return iteradorCliente;
				}
			}
		}else {
			System.out.print("El cliente no existe");
			return null;
		}
		return null;
	}

}
