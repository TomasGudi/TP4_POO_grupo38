package ar.edu.unju.escmi.tp4.dominio;

public class ContratoAlquiler {
    private Vivienda vivienda;
    private Cliente cliente;
    private double gastosInmobiliaria;
    private int duracion;

    public ContratoAlquiler(Vivienda vivienda, Cliente cliente, double gastosInmobiliaria, int duracion) {
        this.vivienda = vivienda;
        this.cliente = cliente;
        this.gastosInmobiliaria = gastosInmobiliaria;
        this.duracion = duracion;
    }

    public double calcularMontoTotal() {
        return vivienda.getPrecioAlquiler() * duracion + gastosInmobiliaria;
    }

    public void mostrarDatos() {
        System.out.println("Contrato de Alquiler [Vivienda: " + vivienda.getCodigo() + ", Cliente: " + cliente.getDni() + "]");
    }
}
