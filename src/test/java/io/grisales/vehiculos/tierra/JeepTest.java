package io.grisales.vehiculos.tierra;

import io.grisales.vehiculos.SinMunicionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeepTest {
    Jeep recon;
    @Before
    public void SetUp(){
        recon = new Jeep(4,1,500,"Recon");
    }
    @Test
    public void dispararAmetralladora() {
        try{
            Assert.assertTrue(recon.dispararAmetralladora());
        }catch (SinMunicionException e){
            e.getMessage();
        }
    }
}