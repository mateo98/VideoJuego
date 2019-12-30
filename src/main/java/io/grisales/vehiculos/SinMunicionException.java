package io.grisales.vehiculos;

public class SinMunicionException extends Exception {
    public SinMunicionException(String modelo){
        super("El" + modelo +" se ha quedado sin municion");
    }
}
