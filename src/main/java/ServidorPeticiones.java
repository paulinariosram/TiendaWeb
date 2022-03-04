

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServidorPeticiones
 */
@WebServlet("/ServidorPeticiones")
public class ServidorPeticiones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServidorPeticiones() {
        super();
      }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {


		ClienteInterface objetoClienteInterface = new ClienteImplementacionInterface();/* cree el ob objetoClienteInterface de la clase ClienteInterface que tiene declarado el metodo 
		 																				que necesito buscarListaClientes o existeClienteLista -- aca no le pongo el = new ClienteInterface
		 																				si no el= new ClienteImplementacionInterface(); porque en el 1ro está declarado el metodo pero en el 2do estan las instrucciones o la impleemntacion de esos metodos
		 																				*/
		Cliente objetoCliente = new Cliente();
		
		objetoCliente.llenarListaClientes(); // ya estoy utilizando el objeto(objetoCliente) de tipo cliente para usar el metodo llenarListaClientes que es donde está la lista llena con el llamado del metododo
		
		
		ProductoInterface objetoProductoInterface = new ProductoImplemInterface();
		Productos objetoProductos = new Productos();
		objetoProductos.llenarListaProductos();
		
		ProveedoresInterface objetoProveedoresInterface = new ProveedoresImplementacionInterface();
		Proveedores objetoProveedores = new Proveedores();
		objetoProveedores.llenarListaProveedores();
		 
		
		
		String parametroOperacion = request.getParameter("parametroOperacion");// declarando variable de tipo string llamada parametroOperacion = con el igual le estoy asignadno una instruccion -- request.getParameter("parametroOperacion"); que le detallo despues del igual de la pagina index del html
			
		switch (parametroOperacion){
		
		case "buscarClienteDocumento": // 	estos valores del case "buscarClienteDocumento": deben ser iguales a los detallados en el index - html del form action que dije que conectaría con servidor peticiones 00
			
			Cliente clienteResultadoBusqueda = objetoClienteInterface.buscarListaClientes(objetoCliente.listaClientes, request.getParameter("documentoCliente")); // usar el objeto de la interface cliente para para utilizar el metodo  y esta --Cliente clienteResultadoBusqueda = --- es para guardar esa respuesta de esa busqueda 
			
		if (clienteResultadoBusqueda != null) {
			response.getWriter().append("La persona es :"+clienteResultadoBusqueda.nombre);
		}	else {
			response.getWriter().append("La persona no existe");

			}
		break;
		
		case "buscarProductoReferencia":
			Productos resultadoProductosBusqueda = objetoProductoInterface.buscarProductos(objetoProductos.listaProductos, request.getParameter("referencia"));
			
		if (resultadoProductosBusqueda != null) {
			response.getWriter().append("El producto seleccionado es :"+resultadoProductosBusqueda.nombre);
		}	else {
			response.getWriter().append("El producto seleccionado no existe");
     
			}
		break;
		
		case "buscarProveedoresNit":
			Proveedores proveedoresResultadoBusqueda = objetoProveedoresInterface.buscarProveedores(objetoProveedores.listaProveedores, request.getParameter("nit"));
			
			if(proveedoresResultadoBusqueda != null){
				response.getWriter().append("El proveedor seleccionado es :"+proveedoresResultadoBusqueda.nombre);
			}else {
				response.getWriter().append("El proveedor no existe");

			}
			break;
				
			
		}
		
		
	}
	


}
