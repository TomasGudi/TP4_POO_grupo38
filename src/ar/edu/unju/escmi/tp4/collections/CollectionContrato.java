package ar.edu.unju.escmi.tp4.collections;

import ar.edu.unju.escmi.tp4.dominio.ContratoAlquiler;
import ar.edu.unju.escmi.tp4.dominio.ContratoCompraVenta;
import java.util.ArrayList;

public class CollectionContrato {
    public static ArrayList<ContratoAlquiler> contratosAlquiler = new ArrayList<>();
    public static ArrayList<ContratoCompraVenta> contratosCompraVenta = new ArrayList<>();

    public static void agregarContratoAlquiler(ContratoAlquiler contrato) {
        contratosAlquiler.add(contrato);
        System.out.println("Contrato de alquiler registrado exitosamente.");
    }

    public static void agregarContratoCompraVenta(ContratoCompraVenta contrato) {
        contratosCompraVenta.add(contrato);
        System.out.println("Contrato de compra-venta registrado exitosamente.");
    }

    public static void mostrarContratosAlquiler() {
        for (ContratoAlquiler contrato : contratosAlquiler) {
            contrato.mostrarDatos();
        }
    }

    public static void mostrarContratosCompraVenta() {
        for (ContratoCompraVenta contrato : contratosCompraVenta) {
            contrato.mostrarDatos();
        }
    }

    public static void calcularViviendasAlquiladas() {
        double totalVentas = 0;
        for (ContratoAlquiler contrato : contratosAlquiler) {
            totalVentas += contrato.calcularMontoTotal();
        }
        System.out.println("Total de ventas de terrenos: $" + totalVentas);
    }


	public static void consultarTerrenosVendidos() {
		double totalVentas = 0;
		for (ContratoCompraVenta contrato : CollectionContrato.contratosCompraVenta) {
			contrato.mostrarDatos();
			totalVentas += contrato.calcularMontoTotal();
		}
		System.out.println("Total de ventas de terrenos: $" + totalVentas);
	}
}

