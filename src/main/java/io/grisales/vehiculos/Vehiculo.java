package io.grisales.vehiculos;

public class Vehiculo {
    private int capacidadPersonas;
    private int capacidadTonalaje;
    private int capacidadMunicion;
    private String modelo;

    public Vehiculo(int capacidadPersonas, int capacidadTonalaje, int capacidadMunicion, String modelo) {
        this.capacidadPersonas = capacidadPersonas;
        this.capacidadTonalaje = capacidadTonalaje;
        this.capacidadMunicion = capacidadMunicion;
        this.modelo = modelo;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public int getCapacidadTonalaje() {
        return capacidadTonalaje;
    }

    public int getCapacidadMunicion() {
        return capacidadMunicion;
    }

    public String getModelo() {
        return modelo;
    }
}
