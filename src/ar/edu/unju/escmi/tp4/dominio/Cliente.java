package ar.edu.unju.escmi.tp4.dominio;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String email;
    private String telefono;

    public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

	public String getDni() {
		return dni;
	}

	public void mostrarDatos() {
        System.out.println("Cliente [Nombre: " + nombre + " " + apellido + ", DNI: " + dni + ", Dirección: " + direccion + ", Email: " + email + ", Teléfono: " + telefono + "]");
    }
}

