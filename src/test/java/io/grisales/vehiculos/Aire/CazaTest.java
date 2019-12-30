package io.grisales.vehiculos.Aire;

import io.grisales.vehiculos.SinMunicionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CazaTest {

    Caza speedFighter;
    @Before
    public void setUp() throws Exception {
        speedFighter = new Caza(2,0,2000,"Speed Fighter");
    }

    @Test
    public void dispararAmetralladora() {
        try{
            Assert.assertTrue(speedFighter.dispararAmetralladora());
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }
}