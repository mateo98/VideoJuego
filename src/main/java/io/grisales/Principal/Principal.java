package io.grisales.Principal;

import io.grisales.vehiculos.Aire.Bombardero;
import io.grisales.vehiculos.Aire.Caza;
import io.grisales.vehiculos.Tropa;
import io.grisales.vehiculos.agua.Crucero;
import io.grisales.vehiculos.agua.PortaAviones;
import io.grisales.vehiculos.tierra.Camion;
import io.grisales.vehiculos.tierra.Jeep;
import io.grisales.vehiculos.tierra.Moto;
import io.grisales.vehiculos.tierra.Tanque;

public class Principal {
    public static void main(String[] args) {
        Tropa equipo1 = new Tropa();
        Moto Harley = new Moto(2,0,0,"Harley");
        Jeep reco = new Jeep(4,1,200,"Reco");
        Tanque sherman = new Tanque(5,3,1000,"Sherman M4");
        Camion suministraHI = new Camion(2,5,0,"Suministros HI");
        Bombardero b56 = new Bombardero(3,2,200,"B56");
        Caza speedFighter = new Caza(2,0,2000,"Speed fighter");
        Crucero alabama = new Crucero(200,20,2000,"Alabama");
        PortaAviones bismarck = new PortaAviones(500,50,5000,"Bismarck");

        equipo1.agregarBombardero(b56);
        equipo1.agregarRafaga(reco);
        equipo1.agregarRafaga(sherman);
        equipo1.agregarRafaga(speedFighter);

        equipo1.atacarRafaga();
        equipo1.ataqueRafagaBomba();

    }
}
