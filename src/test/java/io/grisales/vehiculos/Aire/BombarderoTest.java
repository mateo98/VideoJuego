package io.grisales.vehiculos.Aire;

import io.grisales.vehiculos.SinMunicionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BombarderoTest {

    private Bombardero b56;
    @Before
    public void SetUp(){
        b56 = new Bombardero(5,1,300,"b56");
    }
    @Test
    public void soltarBombas() {
        try{
            Assert.assertTrue("No es el mismo resultado", b56.soltarBombas());
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }

}