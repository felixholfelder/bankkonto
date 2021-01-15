package com.company;

import java.time.LocalDate;

public class Bankmitarbeiter extends Person {

    private String bankMaID;

    public Bankmitarbeiter() {
    }

    public Bankmitarbeiter(String name, LocalDate datum) {
        this.name = name;
        this.datum = datum;
    }
}
