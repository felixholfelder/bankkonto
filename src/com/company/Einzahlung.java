package com.company;

/**
 * The Interface Einzahlung declares the method einzahlen
 * This methods implementation should increase the saldo
 * by the amount of the parameter einzBetrag.
 * */
public interface Einzahlung {

    /**
     * Increases the saldo by the amount of einzBetrag
     * @param einzBetrag: The amount of moeny that is paid in.
     * @return
     * */
    boolean einzahlen(double einzBetrag);
}
