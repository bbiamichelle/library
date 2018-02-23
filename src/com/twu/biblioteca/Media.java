package com.twu.biblioteca;

public abstract class Media {
    private String id;
    private String name;
    private int years;
    User possessor;

    boolean available = true;

    public boolean getToBeAvailable(){
        return available;
    }

    public void setLed(User possessor){
        this.possessor = possessor;
        this.available = false;
    }

    public void setReturn(){
        this.possessor = null;
        this.available = true;
    }
    public String getId() { return id; }
}
