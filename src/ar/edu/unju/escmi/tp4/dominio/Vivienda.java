package ar.edu.unju.escmi.tp4.dominio;

public class Vivienda extends Inmueble {
    private String direccion;
    private int habitaciones;

    public Vivienda(String codigo, boolean disponible, String direccion, int habitaciones, float precio) {
        super(codigo, precio, disponible);
        this.direccion = direccion;
        this.habitaciones = habitaciones;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Vivienda [Código: " + codigo + ", Dirección: " + direccion + ", Habitaciones: " + habitaciones + ", Alquiler: $" + precio + "]");
    }

    public float getPrecio() {
        return precio;
    }
}

