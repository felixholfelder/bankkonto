package com.company;

import java.time.LocalDate;

public abstract class Person {

    protected String name;
    protected String vorname;
    protected LocalDate gebDatum;

    public Person() {}

    public Person(String name, String vorname, LocalDate gebDatum) {
        this.name = name;
        this.vorname = vorname;
        this.gebDatum = gebDatum;
    }
}
