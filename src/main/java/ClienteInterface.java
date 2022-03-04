import java.util.List;

public interface ClienteInterface {

	
	boolean existeClienteLista(List<Cliente>listaClientes,String numeroDoc);
	Cliente buscarListaClientes(List<Cliente> listaClientes,String numeroDoc);
}
