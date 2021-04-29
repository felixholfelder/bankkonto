package com.company;

/**
 * This interface Auszahlung declares the method auszahlen.
 * This methods implementation should decrease the saldo
 * by the amount of parameter ausBetrag
 * */
public interface Auszahlung {



    /**
     * Decreases the saldo by amount of auszBetrag
     * @param auszBetrag: The amount of money that is paid off.
     * @return Returns true, if the money is paid off, false if not.
     * */
    boolean auszahlen(double auszBetrag);
}
