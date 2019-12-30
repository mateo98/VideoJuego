package io.grisales.vehiculos.agua;

import io.grisales.vehiculos.SinMunicionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CruceroTest {
    private Crucero Alabama;

    @Before
    public void setUp() throws Exception {
        Alabama = new Crucero(200,20, 5000, "alabama");
    }

    @Test
    public void dispararMisil() {
        try {
            Assert.assertTrue("El resultado es diferente", Alabama.dispararMisil(1, 2));
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }
}