package com.company;

public class Girokonto extends Konto{

    protected double DISPO = 2000;

    public Girokonto() {}

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
     * @param auszBetrag: the amount that is paid out
     * @return boolean if the payout was sucessfull
     * */
    public boolean auszahlen(double auszBetrag) {
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


}
