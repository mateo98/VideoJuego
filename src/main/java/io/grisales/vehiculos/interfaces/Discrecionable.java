package io.grisales.vehiculos.interfaces;

import io.grisales.vehiculos.SinMunicionException;

public interface Discrecionable extends Atackable {
    public boolean soltarBombas() throws SinMunicionException;
}
