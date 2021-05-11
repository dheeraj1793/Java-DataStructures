package com.javatim;

import java.util.List;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if(this.root == null ){
            this.root = newItem;
            return true;
        }

            ListItem currentItem = this.root;
            while(currentItem != null){

                int cmp = currentItem.compareTo(newItem);

                if(cmp < 0){
                    // newItem is greater move it to right

                   if(currentItem.next() != null){
                       currentItem = currentItem.next();

                   }
                   else{
                       currentItem.setNext(newItem);
                       return true;
                   }

                }
                else if(cmp > 0){
                    // newItem is less,move it to left
                    if(currentItem.previous() !=null){
                        currentItem = currentItem.previous();
                    }
                    else{
                        currentItem.setPrevious(newItem);
                        return true;
                    }
                }
                else{
                    //Equal, so don't add

                    System.out.println(newItem.getValue()+" is already present");
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
        ListItem parentItem = currentItem;

        while(currentItem != null){


            int cmp = (currentItem.compareTo(item));

             if(cmp < 0){   //item is greater than currentItem,Move right.

                 parentItem = currentItem;
                 currentItem = currentItem.next();
             }
             else if(cmp > 0) { // item is less than currentItem ,Move Left.
                 parentItem = currentItem;
                 currentItem = currentItem.previous();
             }
             else {    //They are Equal,we have found the item ,Remove it.

                 performRemoval(currentItem,parentItem);
                 return true;

             }


        }

        return false;
    }

    public void performRemoval(ListItem item , ListItem parent){


        if(item.next()== null){
            //No right tree ,Make parent point to left tree which may be Null.
            if(parent.next() == item){

                // if the item is the right child
                parent.setNext(item.previous());
            }
            else if(parent.previous() == item){

                // if the item is the left child

                parent.setPrevious(item.previous());
            }
            else{

                // if the item is the Root.
                this.root = item.previous();
            }
        }
        else if(item.previous() == null){

            //No left tree, Make parent point to right tree,which may be null
            if(parent.next() == item){

                // if the item is the right child
                parent.setNext(item.next());
            }
            else if(parent.previous() == item){

                // if item is the left child

                parent.setPrevious(item.next());
            }
            else{

                //if the item is the Root
                this.root = item.next();

            }
        }
        else{

            //Neither the child is null ,the item has both the childs

            // Now from the Right Subtree,find the smallest value ,(Leftmost value)

            ListItem current = item.next();
            ListItem leftMostParent = item;

            while(current.previous() != null){

                leftMostParent = current;
                current = current.previous();

            }
            //Now put the smallest value into the node to be deleted

            item.setValue(current.getValue());

            //Now delete the leftMostParent

            if(leftMostParent == item){

                //There was no leftMost node,so current isi the smallest node so delete it.
                item.setNext(current.next());
            }
            else{

                //Set the smallest node's parent to the right child of the smallest node
                //which may be null.

                leftMostParent.setPrevious(current.next());
            }

        }

    }


    @Override
    public void traverse(ListItem root) {

        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
