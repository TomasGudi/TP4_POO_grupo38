package ar.edu.unju.escmi.tp4.dominio;

public class ContratoCompraVenta {
    private Terreno terreno;
    private Cliente cliente;
    private double impuestos;
    private String fechaContrato;

    public ContratoCompraVenta(Terreno terreno, Cliente cliente, double impuestos, String fechaContrato) {
        this.terreno = terreno;
        this.cliente = cliente;
        this.impuestos = impuestos;
        this.fechaContrato = fechaContrato;
    }

    public double calcularMontoTotal() {
        return terreno.getPrecio() + impuestos;
    }

    public void mostrarDatos() {
        System.out.println("Contrato de Compra-Venta [Terreno: " + terreno.getCodigo() + ", Cliente: " + cliente.getDni() + ", Impuestos: $" + impuestos + ", Fecha de Contrato: " + fechaContrato + "]");
    }
}

