package com.javatim;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//
//        String data ="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//
//        String num ="7 8 9 3 6 4 1 2 5 0";
//
//        String[] arr = num.split(" ");
//
//        for(String s: arr){
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("8"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//
//        list.traverse(list.getRoot());


        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());


        //String data ="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String num ="7 8 9 3 6 4 1 2 5 0";

        String[] arr = num.split(" ");

        for(String st: arr){
            tree.addItem(new Node(st));
        }

        tree.traverse(tree.getRoot());


        //tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());


        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());

        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());

        tree.traverse(tree.getRoot());






    }
}
