package io.grisales.vehiculos.interfaces;

import io.grisales.vehiculos.SinMunicionException;

public interface Rafagable extends Atackable {
    public boolean dispararAmetralladora() throws SinMunicionException;
}
