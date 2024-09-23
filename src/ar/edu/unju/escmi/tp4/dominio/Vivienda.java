package ar.edu.unju.escmi.tp4.dominio;

public class Vivienda extends Inmueble {
    private String direccion;
    private int habitaciones;
    private double precioAlquiler;

    public Vivienda(String codigo, boolean disponible, String direccion, int habitaciones, double precioAlquiler) {
        super(codigo, disponible);
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Vivienda [Código: " + codigo + ", Dirección: " + direccion + ", Habitaciones: " + habitaciones + ", Alquiler: $" + precioAlquiler + "]");
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
}

