package ar.edu.unju.escmi.tp4.dominio;

public class ContratoCompraVenta {
    private Terreno terreno;
    private Cliente cliente;
    private double impuestos;

    public ContratoCompraVenta(Terreno terreno, Cliente cliente, double impuestos) {
        this.terreno = terreno;
        this.cliente = cliente;
        this.impuestos = impuestos;
    }

    public double calcularMontoTotal() {
        return terreno.getPrecio() + impuestos;
    }

    public void mostrarDatos() {
        System.out.println("Contrato de Compra-Venta [Terreno: " + terreno.getCodigo() + ", Cliente: " + cliente.getDni() + "]");
    }
}

