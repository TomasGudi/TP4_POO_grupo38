package ar.edu.unju.escmi.tp4.dominio;

public class Terreno extends Inmueble {
    private double latitud;
    private double longitud;
    private double superficie;
    private double precio;

    public Terreno(String codigo, boolean disponible, double latitud, double longitud, double superficie, double precio) {
        super(codigo, disponible);
        this.latitud = latitud;
        this.longitud = longitud;
        this.superficie = superficie;
        this.precio = precio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Terreno [Código: " + codigo + ", Superficie: " + superficie + "m², Precio: $" + precio + "]");
    }

    public double getPrecio() {
        return precio;
    }
}

