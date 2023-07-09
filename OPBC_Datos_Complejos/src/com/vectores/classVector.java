package com.vectores;

import java.util.Vector;

public class classVector {
    public static void main(String[] args) {

        Vector<Integer> vector= new Vector();

        vector.add(1);
        vector.add(2);

        vector.add(3);
        System.out.println(vector);

        vector.remove(1);

        for (int i=0; i<vector.size(); i++)
            System.out.println(vector.get(i));



        System.out.println(vector.size());
        System.out.println(vector.capacity());

        Vector<Integer> vector2= new Vector<>();
        vector2.add(1);
        vector2.add(3);

        boolean result= vector.equals(vector2);
        System.out.println("los vectores son iguales??: " + result);

        for (int i :vector) {
            System.out.println(i);
        }
        System.out.println("cvapacidad vector: "+ vector.capacity());
        vector.trimToSize(); // reduce la capacidad del vector hasta donde esta ocupado
        System.out.println("capacidad vector: "+ vector.capacity());

    }
}
