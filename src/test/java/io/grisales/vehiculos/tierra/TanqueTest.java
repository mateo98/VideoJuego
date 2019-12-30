package io.grisales.vehiculos.tierra;

import io.grisales.vehiculos.SinMunicionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TanqueTest {
    private Tanque shermanM4;
    @Before
    public void SetUp(){
        shermanM4 = new Tanque(5,2,5000, "Sherman M4");
    }
    @Test
    public void dispararCanon() {
        try {
            Assert.assertTrue(shermanM4.dispararCanon());
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }

    @Test
    public void dispararAmetralladora() {
        try {
            Assert.assertTrue(shermanM4.dispararAmetralladora());
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }
}