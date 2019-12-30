package io.grisales.vehiculos.interfaces;

import io.grisales.vehiculos.SinMunicionException;

public interface Dirigible extends Atackable {
    public boolean dispararMisil(int coordenadaX, int coordenadaY) throws SinMunicionException;
}
