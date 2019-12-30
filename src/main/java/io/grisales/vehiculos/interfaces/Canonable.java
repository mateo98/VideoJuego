package io.grisales.vehiculos.interfaces;

import io.grisales.vehiculos.SinMunicionException;

public interface Canonable extends Atackable {
    public boolean dispararCanon() throws SinMunicionException;
}
