package com.company;

public class Girokonto extends Konto{

    protected double DISPO = 2000;

    public Girokonto() {}

    @Override
    public boolean ueberweisen(double uewBeatra, Konto konto) {
        return false;
    }

    public boolean auszahlen(double auszBetrag) {
        return false;
    }

    public boolean ueberweisen(double uewBetrag, String iban) {
        return false;
    }


}
