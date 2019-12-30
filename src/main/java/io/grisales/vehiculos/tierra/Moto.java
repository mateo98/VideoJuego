package io.grisales.vehiculos.tierra;

import io.grisales.vehiculos.Vehiculo;
import io.grisales.vehiculos.interfaces.Atackable;

public class Moto extends Vehiculo {
    public Moto(int capacidadPersonas, int capacidadTonalaje, int capacidadMunicion, String modelo){
        super(capacidadPersonas, capacidadTonalaje, capacidadMunicion, modelo);
    }
}
