package io.grisales.vehiculos.agua;

import io.grisales.vehiculos.SinMunicionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PortaAvionesTest {
    private PortaAviones bismarck;
    @Before
    public void setUp() throws Exception {
        bismarck = new PortaAviones(1500,30,10000,"bismarck");
    }

    @Test
    public void dispararCanon() {
        try{
            Assert.assertTrue("no es el mismo Resultado", bismarck.dispararCanon());
        }catch (SinMunicionException e){
            e.getMessage();
        }

    }

    @Test
    public void dispararAmetralladora() {
        try{
            Assert.assertTrue("no es el mismo Resultado", bismarck.dispararAmetralladora());
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }
}