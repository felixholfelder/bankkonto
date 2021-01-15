package com.company;

public class Sparkonto extends Konto {

    @Override
    public boolean ueberweisen(double uewBeatra, Konto konto) {
        return false;
    }

    public boolean ueberweisen(double uewBetrag, String iban) {
        return false;
    }

    public void jahresZinsAddieren(double jahresdurchschnitt) {}
}
