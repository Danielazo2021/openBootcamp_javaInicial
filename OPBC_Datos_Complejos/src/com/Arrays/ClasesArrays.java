package com.Arrays;

public class ClasesArrays {
    public static void main(String[] args) {
        int arrayUno[] = new int[10];

        int arrayDos[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        arrayDos[0] = 120;
        for (int i : arrayDos) {
            System.out.println(i);
        }

        System.out.println("ahora bi dimensional");


        int arrayBidi[][] = new int[2][4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j <  arrayBidi[i].length; j++) {
                {
                    System.out.println(arrayBidi[i][j]);
                }
            }
        }





    }
}
