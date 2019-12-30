package io.grisales.vehiculos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculoTest {
    private Vehiculo vh;
    @Before
    public void setUp() throws Exception {
        vh = new Vehiculo(1,1,1,"Carro");
    }

    @Test
    public void getCapacidadPersonas() {
        Assert.assertEquals("no es el mismo resultado",1,vh.getCapacidadPersonas());
    }

    @Test
    public void getCapacidadTonalaje() {
        Assert.assertEquals("no es el mismo resultado",1,vh.getCapacidadTonalaje());
    }

    @Test
    public void getCapacidadMunicion() {
        Assert.assertEquals("no es el mismo resultado",1,vh.getCapacidadMunicion());
    }

    @Test
    public void getModelo() {
        Assert.assertEquals("no es el mismo resultado","Carro",vh.getModelo());
    }
}