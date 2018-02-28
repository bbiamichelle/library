package com.twu.biblioteca;

public abstract class Media {
    private String id;
    private String name;
    private int years;
    User possessor;

    Media (String id, String name, int years){
        this.id = id;
        this.name = name;
        this.years = years;

    }

    boolean available = true;

    public boolean getToBeAvailable(){
        return available;
    }

    public void lendToUser(User possessor){
        this.possessor = possessor;
        this.available = false;
    }

    public void setReturn(){
        this.possessor = null;
        this.available = true;
    }
    public String getId() { return id; }

    public String getName() { return name; }

    public int getYears() { return years; }
}
