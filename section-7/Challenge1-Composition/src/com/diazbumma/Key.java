package com.diazbumma;

public class Key {

    private String unique;

    public Key(String unique) {
        this.unique = unique;
    }

    public boolean isMatch(String unique) {
        return this.unique.equals(unique);
    }

    public String getUnique() {
        return unique;
    }
}
