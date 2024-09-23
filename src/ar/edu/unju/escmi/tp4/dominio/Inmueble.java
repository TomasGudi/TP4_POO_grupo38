package ar.edu.unju.escmi.tp4.dominio;

public abstract class Inmueble {
    protected String codigo;
    protected boolean disponible;

    public Inmueble(String codigo, boolean disponible) {
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void mostrarDatos();
}

