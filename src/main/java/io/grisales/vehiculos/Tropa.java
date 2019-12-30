package io.grisales.vehiculos;

import io.grisales.vehiculos.Aire.Bombardero;
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

    public boolean agregarRafaga(Rafagable vehiculo){
        vhRafagable.add(vehiculo);
        return true;
    }

    public boolean atacarRafaga(){;
        int conteo = 0;
        for(Rafagable vh:vhRafagable){
            try{
            vh.dispararAmetralladora();
            }catch (SinMunicionException e){
                System.out.println(e.getMessage());
            }finally {
                conteo++;
            }

        }
        if(conteo == vhRafagable.size()){
            return true;
        }
        return false;
    }

    public boolean atacarBombarderos(){
        int conteo =  0;
        for (Discrecionable vh:vhDiscrecionable){
            try{
                vh.soltarBombas();
            }catch (SinMunicionException e){
                System.out.println(e.getMessage());
            }finally {
                conteo++;
            }
        }
        if(conteo == vhDiscrecionable.size()){
            return true;
        }
        return false;
    }

    public boolean agregarBombardero(Bombardero vehiculo){
        vhDiscrecionable.add(vehiculo);
        return true;
    }

    public boolean agregarDirigible(Dirigible vehiculo){
        vhDirigible.add(vehiculo);
        return true;
    }

    public boolean atacarDirigible(){
        int conteo =  0;
        int coordenadax=0, coordenadaY=0;
        for (Dirigible vh: vhDirigible){
            try{
                vh.dispararMisil(coordenadax,coordenadaY);
                coordenadax++;
                coordenadaY++;
            }catch (SinMunicionException e){
                System.out.println(e.getMessage());
            }finally {
                conteo++;
            }
        }
        if(conteo == vhDirigible.size()){
            return true;
        }
        return false;
    }

    public boolean ataqueRafagaBomba(){
        if(atacarBombarderos() && atacarRafaga()){
            return true;
        }
        return false;
    }
}
