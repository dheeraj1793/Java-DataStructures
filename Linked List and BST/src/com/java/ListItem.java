package com.javatim;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public void setValue(Object value){
        this.value = value;
    }
    public Object getValue(){
        return this.value;
    }

    public abstract int compareTo(ListItem item);
    public abstract ListItem next();
    public abstract ListItem setNext(ListItem item);
    public abstract ListItem previous();
    public abstract ListItem setPrevious(ListItem item);

}
