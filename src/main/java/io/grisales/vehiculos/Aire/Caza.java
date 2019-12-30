package io.grisales.vehiculos.Aire;

import io.grisales.vehiculos.SinMunicionException;
import io.grisales.vehiculos.Vehiculo;
import io.grisales.vehiculos.interfaces.Rafagable;

public class Caza extends Vehiculo implements Rafagable {
    public Caza(int capacidadPersonas, int capacidadTonalaje, int capacidadMunicion, String modelo){
        super(capacidadPersonas,capacidadTonalaje,capacidadMunicion,modelo);
    }


    public boolean dispararAmetralladora() throws SinMunicionException {
        if(getCapacidadMunicion() <= 0){
            throw new SinMunicionException(getModelo());
        }else{
            System.out.println("Disparando ametralladora desde caza"+ getModelo());
            return true;
        }
    }
}
