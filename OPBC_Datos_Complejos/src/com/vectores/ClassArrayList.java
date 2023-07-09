package com.vectores;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        for (String s : list) {
            System.out.println(s);

        }

        String array[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        for (String key: array) {
            System.out.println(key);
        }

        // diferencia entre linkedlist arraylist

        LinkedList<String> listaEnlazada= new LinkedList<String>();
        listaEnlazada.add("A");



    }
}