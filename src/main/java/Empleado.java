import java.util.ArrayList;
import java.util.List;

public class Empleado {

	String Nombres;
	String apellido1;
	String tipoDoc;
	String numeroDoc;
	String telFijo;
	String telCel;
	String Direccion;
	int vlrHora;
	long baseSalarial;
	List<Empleado> listaEmpleados = new ArrayList<Empleado>();
	
	public void iniciarListaEmpleados() {

	listaEmpleados.add(new Empleado ("Andrea Maria","perez","c","43200200","2302501","3202502501","Cl 10 20 30",3000,720000));
	listaEmpleados.add(new Empleado("Paula Andrea","Martinez","c","43200300","2302580","3202502500","Cl 10 80 20",4000,960000));
	listaEmpleados.add(new Empleado("Manuel","Gonzalez","c","98700700","2300000","3005002501","Cl 96 65 30",5000,1200000));
	}

	public void Vender() {
	}

	public void hacerInventario() {
	}

	public void asearTienda() {
	}

	public void RecibirNomina() {
	}

	public void ingresarLaborar() {
	}

	public void salirLaborar() {
	}

	public void cerrarCaja() {
	}

	public Empleado(String nombres, String apellido1, String tipoDoc, String numeroDoc,
			String telFijo, String telCel, String direccion, int vlrHora, long baseSalarial) {
		this.Nombres = nombres;
		this.apellido1 = apellido1;
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.telFijo = telFijo;
		this.telCel = telCel;
		this.Direccion = direccion;
		this.vlrHora = vlrHora;
		this.baseSalarial = baseSalarial;
	}

	
}