package com.diazbumma.linkedlist;

import com.diazbumma.ListItem;

public class NodeList extends ListItem {

    private NodeList prev;
    private NodeList next;

    public NodeList(String data) {
        super(data);
        this.prev = null;
        this.next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPrevious() {
        return prev != null;
    }

    @Override
    public String getData() {
        return super.getData();
    }

    public void setNext(NodeList next) {
        this.next = next;
    }

    public void setPrev(NodeList prev) {
        this.prev = prev;
    }

    public NodeList getNext() {
        return next;
    }

    public NodeList getPrev() {
        return prev;
    }

    @Override
    public int compareTo(ListItem item) {
        return this.data.compareTo(item.getData());
    }
}
