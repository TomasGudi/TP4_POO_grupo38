package ar.edu.unju.escmi.tp4.collections;

import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;
import java.util.ArrayList;

public class CollectionInmueble {
    public static ArrayList<Terreno> terrenos = new ArrayList<>();
    public static ArrayList<Vivienda> viviendas = new ArrayList<>();

    public static void agregarTerreno(Terreno terreno) {
        terrenos.add(terreno);
        System.out.println("Terreno agregado exitosamente.");
    }

    public static void agregarVivienda(Vivienda vivienda) {
        viviendas.add(vivienda);
        System.out.println("Vivienda agregada exitosamente.");
    }

    public static Terreno buscarTerrenoPorCodigo(String codigo) {
        for (Terreno terreno : terrenos) {
            if (terreno.getCodigo().equals(codigo)) {
                return terreno;
            }
        }
        return null;
    }

    public static Vivienda buscarViviendaPorCodigo(String codigo) {
        for (Vivienda vivienda : viviendas) {
            if (vivienda.getCodigo().equals(codigo)) {
                return vivienda;
            }
        }
        return null;
    }

    public static void mostrarTerrenosDisponibles() {
        for (Terreno terreno : terrenos) {
            if (terreno.isDisponible()) {
                terreno.mostrarDatos();
            }
        }
    }

    public static void mostrarViviendasDisponibles() {
        for (Vivienda vivienda : viviendas) {
            if (vivienda.isDisponible()) {
                vivienda.mostrarDatos();
            }
        }
    }
}

