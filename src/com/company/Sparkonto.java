package com.company;

public class Sparkonto extends Konto {

    /**
     * @param uewBeatrag: the amount of the account
     * @param konto: the account
     * @return boolean if the transfer was sucessfull
     * */
    @Override
    public boolean ueberweisen(double uewBeatrag, Konto konto) {
        return false;
    }

    /**
     * @param uewBetrag: the amount of the account
     * @param iban: the iban of the account
     * @return boolean if the transfer was sucessfull
     * */
    public boolean ueberweisen(double uewBetrag, String iban) {
        return false;
    }

    /**
     * caluculates the average pay rent
     * */
    public void jahresZinsAddieren(double jahresdurchschnitt) {}
}
