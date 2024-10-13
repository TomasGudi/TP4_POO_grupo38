package ar.edu.unju.escmi.tp4.dominio;

public class Contrato {
	protected static long codigoC;
	protected Inmueble inmueble;
	protected Cliente cliente;
	public String fechaContrato;
	
	public Contrato(long codigoC, Inmueble inmueble, Cliente cliente, String fechaContrato) {
		Contrato.codigoC = codigoC;
		this.inmueble = inmueble;
		this.fechaContrato = fechaContrato;
	}
	
	
	public double calcularMontoTotal() {
		return 0;
	}
	
	public void mostrarDatos() {
		
	}
	
}
