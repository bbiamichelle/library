package com.twu.biblioteca;

import java.util.List;

public abstract class Midias {
    private String id;
    private String name;
    private String author;
    private int years;


    public String getId() { return id; }

    public String getName() { return name; }

    public String getAuthor() { return author; }

    public int getYears() { return years; }

    public abstract String showList (List<Midias> midiasList);

    public abstract String getRepresentation(Midias midias);

    public abstract String showTable(List<Midias> midiasList);

    public abstract void borrowMidias(String id);

    public abstract void returnMidias(String id);

    public abstract List unavailableMidias();

}
