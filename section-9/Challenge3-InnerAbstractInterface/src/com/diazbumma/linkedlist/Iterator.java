package com.diazbumma.linkedlist;

public interface Iterator {

    boolean hasNext();

    boolean hasPrevious();

    String next();

    String previous();

    void remove();
}
