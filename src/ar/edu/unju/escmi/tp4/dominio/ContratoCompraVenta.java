package ar.edu.unju.escmi.tp4.dominio;

public class ContratoCompraVenta extends Contrato {
    private Terreno terreno;
    private double impuestos;

    public ContratoCompraVenta(long codigoC, Terreno terreno, Cliente cliente, double impuestos, String fechaContrato) {
    	super(codigoC, terreno, cliente,fechaContrato);
        this.terreno = terreno;
        this.impuestos = impuestos;
        this.fechaContrato = fechaContrato;
    }

    @Override
    public double calcularMontoTotal() {
        return terreno.getPrecio() + impuestos;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Contrato de Compra-Venta [Terreno: " + Inmueble.getCodigo() + ", Cliente: " + cliente.getDni() + ", Impuestos: $" + impuestos + ", Fecha de Contrato: " + fechaContrato + "]");
    }
}

