package com.company;

public abstract class Konto implements Einzahlung, Auszahlung {

    protected String iban;
    protected double saldo = 0;
    private boolean gesperrt = false;

    @Override
    public boolean auszahlen(double auszBetrag) {
        return true;
    }

    @Override
    public boolean einzahlen(double einzBetrag) {
        return true;
    }

    public boolean ueberweisen(double uewBetrag, String iban) {
        return true;
    }

    public abstract boolean ueberweisen(double uewBeatra, Konto konto);
}
