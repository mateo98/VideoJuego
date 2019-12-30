package io.grisales.vehiculos;

import io.grisales.vehiculos.tierra.Tanque;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TropaTest {
    private Tropa equipo;
    private Tanque m4;
    @Before
    public void setUp() throws Exception {
        equipo = new Tropa();
        m4 = new Tanque(1,1,1, "m4");
    }

    @Test
    public void agregarVehiculo() {
        Assert.assertTrue(equipo.agregarVehiculo(m4));
    }

    @Test
    public void sumarCapacidadPersonas() {
        equipo.agregarVehiculo(m4);
        Assert.assertEquals("No es el mismo Resultado", 1,  equipo.SumarCapacidadPersonas());
    }

    @Test
    public void getTotalCapacidadPersonas() {
        Assert.assertEquals("no es el mismo resultado", 0, equipo.getTotalCapacidadPersonas());
    }

    @Test
    public void sumarCapacidadToneladas() {
        equipo.agregarVehiculo(m4);
        Assert.assertEquals("No es el mismo Resultado", 1,  equipo.sumarCapacidadToneladas(),0);

    }

    @Test
    public void getTotalCapacidadToneladas() {
        Assert.assertEquals("no es el mismo resultado", 0, equipo.getTotalCapacidadToneladas(),0);
    }

    @Test
    public void agregarRafaga() {
        Assert.assertTrue(equipo.agregarRafaga(m4));
    }


    @Test
    public void atacarRafaga() {
        Assert.assertTrue(equipo.atacarRafaga());
    }
}