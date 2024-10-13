package ar.edu.unju.escmi.tp4.dominio;

public class Terreno extends Inmueble {
    private double latitud;
    private double longitud;
    private double superficie;

    public Terreno(String codigo, boolean disponible, double latitud, double longitud, double superficie, float precio) {
        super(codigo, precio, disponible);
        this.latitud = latitud;
        this.longitud = longitud;
        this.superficie = superficie;
    }

    public float getPrecio() {
        return precio;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Terreno [Código: " + codigo + ", Superficie: " + superficie + "m², Precio: $" + precio + "]");
    }



}

