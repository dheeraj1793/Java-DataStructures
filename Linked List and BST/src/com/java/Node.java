package com.javatim;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }


    @Override
    public int compareTo(ListItem item) {

        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else
            return -1;
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

}
