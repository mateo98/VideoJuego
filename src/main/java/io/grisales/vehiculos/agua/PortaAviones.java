package io.grisales.vehiculos.agua;

import io.grisales.vehiculos.SinMunicionException;
import io.grisales.vehiculos.Vehiculo;
import io.grisales.vehiculos.interfaces.Canonable;
import io.grisales.vehiculos.interfaces.Rafagable;

public class PortaAviones extends Vehiculo implements Canonable, Rafagable {
    public PortaAviones(int capacidadPersonas, int capacidadTonalaje, int capacidadMunicion, String modelo){
        super(capacidadPersonas,capacidadTonalaje,capacidadMunicion,modelo);
    }


    public boolean dispararCanon() throws SinMunicionException {
        if(getCapacidadMunicion() <= 0){
            throw new SinMunicionException(getModelo());
        }else{
            System.out.println("Disparando cañon desde porta aviones"+ getModelo());
            return true;
        }
    }

    public boolean dispararAmetralladora() throws SinMunicionException {
        if(getCapacidadMunicion() <= 0){
            throw new SinMunicionException(getModelo());
        }else{
            System.out.println("Disparando ametralladora desde Porta aviones"+ getModelo());
            return true;
        }
    }
}
