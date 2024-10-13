package ar.edu.unju.escmi.tp4.main;

import java.util.Random;
import java.util.Scanner;

import ar.edu.unju.escmi.tp4.collections.CollectionCliente;
import ar.edu.unju.escmi.tp4.collections.CollectionContrato;
import ar.edu.unju.escmi.tp4.collections.CollectionInmueble;
import ar.edu.unju.escmi.tp4.dominio.Cliente;
import ar.edu.unju.escmi.tp4.dominio.ContratoAlquiler;
import ar.edu.unju.escmi.tp4.dominio.ContratoCompraVenta;
import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("----Menu----");
			System.out.println("[1] Registrar terreno");
			System.out.println("[2] Registrar vivienda");
			System.out.println("[3] Registrar cliente");
			System.out.println("[4] Alquiler de vivienda");
			System.out.println("[5] Venta de terreno");
			System.out.println("[6] Consultar inmuebles disponibles");
			System.out.println("[7] Consultar viviendas alquiladas");
			System.out.println("[8] Consultar terrenos vendidos");
			System.out.println("[9] Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			
			System.out.println(" ");
			
			switch (opcion) {
			case 1:
				registrarTerreno(sc);
				break;
			case 2:
				registrarVivienda(sc);
				break;
			case 3:
				registrarCliente(sc);
				break;
			case 4:
				alquilerVivienda(sc);
				break;
			case 5:
				ventaTerreno(sc);
				break;
			case 6:
				consultarInmueblesDisponibles(sc);
				break;
			case 7:
				CollectionContrato.calcularViviendasAlquiladas();
				break;
			case 8:
				CollectionContrato.consultarTerrenosVendidos();
				break;
			case 9:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida.");
			}
			System.out.println(" ");
		} while (opcion != 9);

		sc.close();
	}
	
	public static void registrarTerreno(Scanner sc) {
		System.out.print("Ingrese el código del terreno: ");
		String codigo = sc.next();
		System.out.print("Ingrese latitud: ");
		double latitud = sc.nextDouble();
		System.out.print("Ingrese longitud: ");
		double longitud = sc.nextDouble();
		System.out.print("Ingrese superficie (m²): ");
		double superficie = sc.nextDouble();
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		CollectionInmueble.agregarTerreno(new Terreno(codigo, true, latitud, longitud, superficie, precio));
		System.out.println("Terreno registrado exitosamente.");
	}

	
	public static void registrarVivienda(Scanner sc) {
		System.out.print("Ingrese el código de la vivienda: ");
		String codigo = sc.next();
		System.out.print("Ingrese la dirección: ");
		sc.nextLine();
		String direccion = sc.nextLine();
		System.out.print("Ingrese cantidad de habitaciones: ");
		int habitaciones = sc.nextInt();
		System.out.print("Ingrese el precio de alquiler mensual: ");
		float precio = sc.nextFloat();
		CollectionInmueble.agregarVivienda(new Vivienda(codigo, true, direccion, habitaciones, precio));
		System.out.println("Vivienda registrada exitosamente.");
	}


	public static void registrarCliente(Scanner sc) {
		System.out.print("Ingrese nombre del cliente: ");
		String nombre = sc.next();
		System.out.print("Ingrese apellido: ");
		String apellido = sc.next();
		System.out.print("Ingrese DNI: ");
		String dni = sc.next();
		System.out.print("Ingrese telefono: ");
		String telefono = sc.next();
		System.out.print("Ingrese email: ");
		String email = sc.next();
		System.out.print("Ingrese direccion: ");
		String direccion = sc.next();
    
		CollectionCliente.agregarCliente(new Cliente(nombre, apellido, dni, telefono, email, direccion));
		System.out.println("Cliente registrado exitosamente.");
	}


	public static void alquilerVivienda(Scanner sc) {
		System.out.print("Ingrese el código de la vivienda: ");
		String codigoVivienda = sc.next();
		Vivienda vivienda = CollectionInmueble.buscarViviendaPorCodigo(codigoVivienda);

		if (vivienda != null && vivienda.isDisponible()) {
			System.out.print("Ingrese DNI del cliente: ");
			String dniCliente = sc.next();
			Cliente cliente = CollectionCliente.buscarClientePorDni(dniCliente);

			if (cliente != null) {
				Random random = new Random();
				System.out.print("Ingrese la duración del contrato (en meses): ");
				int duracion = sc.nextInt();
				System.out.print("Ingrese los gastos de la inmobiliaria: ");
				double gastosInmobiliaria = sc.nextDouble();
				System.out.print("Ingrese la fecha del contrato: ");
				String fechaContrato = sc.next();
				long codigoC = 10000 + random.nextInt(90000);
				
				ContratoAlquiler contrato = new ContratoAlquiler(codigoC, vivienda, cliente, gastosInmobiliaria, duracion, fechaContrato);
				CollectionContrato.agregarContratoAlquiler(contrato);
				vivienda.setDisponible(false);

				System.out.println("Alquiler registrado exitosamente. Monto total: $" + contrato.calcularMontoTotal());
			} else {
				System.out.println("Cliente no encontrado.");
			}
		} else {
			System.out.println("Vivienda no disponible o no encontrada.");
		}
	}


	public static void ventaTerreno(Scanner sc) {
		System.out.print("Ingrese el código del terreno: ");
		String codigoTerreno = sc.next();
		Terreno terreno = CollectionInmueble.buscarTerrenoPorCodigo(codigoTerreno);

		if (terreno != null && terreno.isDisponible()) {
			System.out.print("Ingrese DNI del cliente comprador: ");
			String dniCliente = sc.next();
			Cliente cliente = CollectionCliente.buscarClientePorDni(dniCliente);

			if (cliente != null) {
				Random random = new Random();
				System.out.print("Ingrese el valor de los impuestos: ");
				double impuestos = sc.nextDouble();
				System.out.print("Ingrese la fecha del contrato: ");
				String fechaContrato = sc.next();
				long codigoC = 10000 + random.nextInt(90000);

				ContratoCompraVenta contrato = new ContratoCompraVenta(codigoC, terreno, cliente, impuestos, fechaContrato);
				CollectionContrato.agregarContratoCompraVenta(contrato);
				terreno.setDisponible(false);

				System.out.println("Venta registrada exitosamente. Monto total: $" + contrato.calcularMontoTotal());
			} else {
				System.out.println("Cliente no encontrado.");
			}
		} else {
			System.out.println("Terreno no disponible o no encontrado.");
		}
	}


	public static void consultarInmueblesDisponibles(Scanner sc) {
		System.out.print("¿Desea ver 1- Viviendas o 2- Terrenos? ");
		int tipo = sc.nextInt();

		if (tipo == 1) {
			CollectionInmueble.mostrarViviendasDisponibles();
		} else if (tipo == 2) {
			CollectionInmueble.mostrarTerrenosDisponibles();
		} else {
			System.out.println("Opción inválida.");
		}
	}

	
}


