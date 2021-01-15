package com.company;

import java.time.LocalDate;

public class Person {

    protected String name;
    protected String vorname;
    protected LocalDate datum;

    public Person() {}

    public Person(String name, String vorname, LocalDate datum) {
        this.name = name;
        this.vorname = vorname;
        this.datum = datum;
    }
}
