package com.company;

public abstract class Konto implements Einzahlung, Auszahlung {

    protected String iban;
    protected double saldo = 0;
    private boolean gesperrt = false;

    /**
     * @param auszBetrag: the amount of the account
     * @return boolean if the payout was sucessfull
     * */
    @Override
    public boolean auszahlen(double auszBetrag) {
        return true;
    }

    /**
     * @param einzBetrag: the amount of the account that should be payed in
     * @return boolean if the deposit was sucessfull
     * */
    @Override
    public boolean einzahlen(double einzBetrag) {
        return true;
    }

    /**
     * @param uewBetrag: the amount of the account
     * @param iban: the iban of the account
     * @return boolean if the transfer was sucessfull
     * */
    public boolean ueberweisen(double uewBetrag, String iban) {
        return true;
    }

    /**
     * @param uewBeatrag: the amount of the account
     * @param konto: the account
     * @return boolean if the transfer was sucessfull
     * */
    public abstract boolean ueberweisen(double uewBeatrag, Konto konto);
}
