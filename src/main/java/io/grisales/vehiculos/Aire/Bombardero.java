package io.grisales.vehiculos.Aire;

import io.grisales.vehiculos.SinMunicionException;
import io.grisales.vehiculos.Vehiculo;
import io.grisales.vehiculos.interfaces.Discrecionable;

public class Bombardero extends Vehiculo implements Discrecionable {
    public Bombardero(int capacidadPersonas, int capacidadTonalaje, int capacidadMunicion, String modelo){
        super(capacidadPersonas,capacidadTonalaje,capacidadMunicion,modelo);
    }


    public boolean soltarBombas() throws SinMunicionException {
        if(getCapacidadMunicion() <= 0){
            throw new SinMunicionException(getModelo());
        }else{
            System.out.println("Soltando bombas desde Bombardero"+ getModelo());
            return true;
        }
    }
}
