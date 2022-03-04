import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {

	String numfact;
	double valorFact;
	String estado; // pendiente,pagada,abonada,anulada....
	String fechaGeneracion;
	String fechaRecaudo;
	String fechaAnulacion;
	List<Factura> listaFacturas = new ArrayList<Factura>();
	
	
	public void iniciarListaFacturas() {
	
	listaFacturas.add(new Factura("10203040",200000,"pagada","08/01/2022","08/01/2022",null));
	listaFacturas.add(new Factura("10203041",550000,"pendiente","08/01/2022",null,null));
	listaFacturas.add(new Factura("10203042",43000,"abonada","08/01/2022","10/01/2022",null));
	listaFacturas.add(new Factura("10203043",88000,"anulada","15/01/2022",null,"15/01/2022"));
	listaFacturas.add(new Factura("10203044",83000,"pagada","22/01/2022","25/01/2022",null));
	
	}
	public Factura() {
	}

	public void ingresa() {
	}

	public void paga() {
	}

	public void abona() {
	}

	public void anula() {
	}

	public Factura(String numfact, double valorFact, String estado, String fechaGeneracion, String fechaRecaudo,
			String fechaAnulacion) {
		this.numfact = numfact;
		this.valorFact = valorFact;
		this.estado = estado;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaRecaudo = fechaRecaudo;
		this.fechaAnulacion = fechaAnulacion;
	}
	
}
