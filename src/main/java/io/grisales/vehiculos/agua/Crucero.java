package io.grisales.vehiculos.agua;

import io.grisales.vehiculos.SinMunicionException;
import io.grisales.vehiculos.Vehiculo;
import io.grisales.vehiculos.interfaces.Dirigible;

public class Crucero extends Vehiculo implements Dirigible {
    public Crucero(int capacidadPersonas, int capacidadTonalaje, int capacidadMunicion, String modelo){
        super(capacidadPersonas,capacidadTonalaje,capacidadMunicion,modelo);
    }

    public boolean dispararMisil(int coordenadaX, int coordenadaY) throws SinMunicionException {
        if(getCapacidadMunicion() <= 0){
            throw new SinMunicionException(getModelo());
        }else{
            System.out.println("Disparando misil teledirigido a las coordenadas X:"+ coordenadaX+" Y:"+
                    coordenadaY+" desde crucero "+getModelo());
            return true;
        }
    }
}
