package com.company;

public abstract class Konto {

    protected String iban;
    protected double saldo = 0;
    private boolean gesperrt = false;

    public boolean auszahlen(double auszBetrag) {
        return true;
    }

    public boolean einzahlen(double einzBetrag) {
        return true;
    }

    public boolean ueberweisen(double uewBetrag, String iban) {
        return true;
    }

    public abstract boolean ueberweisen(double uewBeatra, Konto konto);
}
