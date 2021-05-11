package com.javatim;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if(this.root == null){
            // The list is empty this item will be the root.
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while(currentItem != null){

            int comparision = (currentItem.compareTo(newItem));
            if(comparision < 0){

                //The newItem is bigger so move it to right.
                if(currentItem.next() != null){
                    currentItem=currentItem.next();
                }
                else{

                    // Insert at the end of the List.

                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }

            }
            else if(comparision > 0){

                //newItem is less insert it before

                if(currentItem.previous() != null){

                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                }
                else{

                    // if there is no previous node, Make the new node as the root

                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root= newItem;

                }
                return true;
            }

            else{

                // if they are equal

                System.out.println(newItem .getValue()+ " is already present in the List ,Not Added" );
                return false;

            }

        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {


        if(item != null){
            System.out.println("Deleting Item : "+item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int cmp = currentItem.compareTo(item);

            if(cmp == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();
                }
                else{
                    currentItem.previous().setNext(currentItem.next());

                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            else if(cmp < 0){
                //This item is bigger so move to next
                currentItem = currentItem.next();
            }
            else{
                // if the item is smaller then there is no item in list
                return false;
            }
        }

        //reaches end of the while loop, No item found.
        return false;
    }

    @Override
    public void traverse(ListItem root) {


        if(root == null)
            System.out.println("List is Empty");
        else{
            while(root!=null){
                System.out.println(root.getValue());
                root=root.next();
            }
        }

    }
}
