package com.diazbumma.linkedlist;

public class LinkedList {

    private NodeList head;
    private NodeList tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(String data) {
        if (isEmpty()) {
            head = new NodeList(data);
            tail = head;
        } else {
            NodeList newNodeList = new NodeList(data);
            tail.setNext(newNodeList);
            tail = newNodeList;
        }
    }

    //same data won't be added
    public void addInOrder(NodeList data) {
        if (isEmpty()) {
            head = data;
            tail = head;
        } else {
            NodeList current = head;
            boolean inserted = false;

            while (current.compareTo(data) < 0) {
                if (current.hasNext()) {
                    current = current.getNext();
                } else {
                    inserted = true;
                    current.setNext(data);
                    data.setPrev(current);
                    break;
                }
            }

            if (current.compareTo(data) == 0)
                return;

            if (!inserted) {
                if (current == head) {
                    data.setNext(current);
                    current.setPrev(data);
                    head = data;
                } else {
                    data.setNext(current);
                    data.setPrev(current.getPrev());
                    NodeList prevNodeList = current.getPrev();
                    prevNodeList.setNext(data);
                    current.setPrev(data);
                }
            }
        }
    }

    public boolean isEmpty() {
        return head==null && tail==null;
    }

    public Iterator getIterator() {
        return new LinkedListIterator(head);
    }

    class LinkedListIterator implements Iterator {

        NodeList current;

        LinkedListIterator(NodeList initNodeList) {
            this.current = initNodeList;
        }

        public void setCurrent(NodeList current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current.hasNext();
        }

        @Override
        public boolean hasPrevious() {
            return current.hasPrevious();
        }

        @Override
        public String next() {
            String data = current.getData();
            if (current.hasNext())
                current = current.getNext();
            return data;
        }

        @Override
        public String previous() {
            String data = current.getData();
            if (current.hasPrevious())
                current = current.getPrev();
            return data;
        }

        @Override
        public void remove() {
            if (current.hasPrevious() && current.hasNext()) {
                NodeList prevNodeList = current.getPrev();
                NodeList nextNodeList = current.getNext();
                prevNodeList.setNext(nextNodeList);
                nextNodeList.setPrev(prevNodeList);
                current = nextNodeList;
            } else if (!current.hasPrevious() && current.hasNext()) {
                NodeList nextNodeList = current.getNext();
                nextNodeList.setPrev(null);
                current = nextNodeList;
            } else if (current.hasPrevious() && !current.hasNext()) {
                NodeList prevNodeList = current.getPrev();
                prevNodeList.setNext(null);
                current = prevNodeList;
            } else {
                current = null;
            }
        }
    }
}
