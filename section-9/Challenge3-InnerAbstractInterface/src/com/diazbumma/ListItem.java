package com.diazbumma;

public abstract class ListItem {

    protected String data;

    protected ListItem(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public abstract int compareTo(ListItem item);
}
