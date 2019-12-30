package io.grisales.vehiculos;

import io.grisales.vehiculos.interfaces.*;

import java.util.ArrayList;

public class Tropa {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Dirigible> vhDirigible = new ArrayList<Dirigible>();
    private ArrayList<Rafagable> vhRafagable = new ArrayList<Rafagable>();
    private ArrayList<Discrecionable> vhDiscrecionable = new ArrayList<Discrecionable>();
    private int totalCapacidadPersonas = 0;
    private double totalCapacidadToneladas = 0;

    public Tropa(){}

    public boolean agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        return true;
    }

    public int SumarCapacidadPersonas(){
        for(Vehiculo vehiculo:vehiculos){
            totalCapacidadPersonas += vehiculo.getCapacidadPersonas();
        }
        return totalCapacidadPersonas;
    }

    public int getTotalCapacidadPersonas() {
        return totalCapacidadPersonas;
    }

    public double sumarCapacidadToneladas(){
        for(Vehiculo vehiculo:vehiculos){
            totalCapacidadToneladas += vehiculo.getCapacidadTonalaje();
        }
        return totalCapacidadToneladas;
    }

    public double getTotalCapacidadToneladas() {
        return totalCapacidadToneladas;
    }
}
