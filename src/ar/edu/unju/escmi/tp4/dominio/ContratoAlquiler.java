package ar.edu.unju.escmi.tp4.dominio;

public class ContratoAlquiler extends Contrato {
	private Vivienda vivienda;
    private double gastosInmobiliaria;
    private int duracion;

    public ContratoAlquiler(long codigoC, Vivienda vivienda, Cliente cliente, double gastosInmobiliaria, int duracion, String fechaContrato) {
    	super(codigoC, vivienda, cliente, fechaContrato);
        this.cliente = cliente;
        this.gastosInmobiliaria = gastosInmobiliaria;
        this.duracion = duracion;
    }

    @Override
    public double calcularMontoTotal() {
        return vivienda.getPrecio() * duracion + gastosInmobiliaria;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Contrato de Alquiler [Vivienda: " + Inmueble.getCodigo() + ", Cliente: " + cliente.getDni() + ", Duración: " + duracion + " meses, Gastos: $" + gastosInmobiliaria + ", Fecha de Contrato: " + fechaContrato + "]");
    }
}
