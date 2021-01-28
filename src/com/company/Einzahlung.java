package com.company;

/**
 * The Interface Einzahlung declares the method einzahlen
 * This methods implementation should increase the saldo
 * by the amount of the parameter einzBetrag.
 * */
public interface Einzahlung {

    /**
     * Increases the saldo by the amount of einzBetrag
     * @param einzBetrag: The amount of money that is paid in.
     * @return Returns true, if the method einzahlen was successful, false if not
     * */
    boolean einzahlen(double einzBetrag);
}
