package ar.edu.unju.escmi.tp4.dominio;

public abstract class Inmueble {
    protected static String codigo;
    protected boolean disponible;
    protected float precio;

    public Inmueble(String codigo, float precio, boolean disponible) {
        Inmueble.codigo = codigo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public static String getCodigo() {
        return codigo;
    }
    
	public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract void mostrarDatos();
}

