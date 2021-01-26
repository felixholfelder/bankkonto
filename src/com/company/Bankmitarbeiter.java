package com.company;

import com.sun.org.glassfish.gmbal.ParameterNames;

import java.time.LocalDate;

public class Bankmitarbeiter extends Person {

    private String bankMaID;

    public Bankmitarbeiter() {
    }

    public Bankmitarbeiter(String name, LocalDate gebDatum) {
        this.name = name;
        this.gebDatum = gebDatum;
    }
}
