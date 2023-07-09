package com.EntradaYSalida;

import javax.print.DocFlavor;
import java.io.*;
import java.util.Scanner;

public class EntradaySalida {
    public static void main(String[] args) throws IOException {
        // byte[] data=new byte[10000];
      /*  try {
            InputStream fichero = new FileInputStream("Practicar programacion.txt");
            try {
               byte[]  data = fichero.readAllBytes();
                 for ( byte dato: data ) {
                     System.out.println((char) dato);
                }*/
       /* try {
            InputStream fichero = new FileInputStream("Practicar programacion.txt");
            try {
                byte datos[]= new byte[5];// esto seria para leer de 5 en 5, pero no lo termine de hacer
                int data = fichero.read();

                while (data != -1) {

                    System.out.print((char)data);
                    data=fichero.read();
                    }
                }catch(IOException e){
                    System.out.println("Nose puede leer" + e.getMessage());
                }
                //  System.out.println(new String(data));

            } catch (FileNotFoundException e) {
                System.out.println("El programa da error: " + e.getMessage());
            }

*/
/*
        try {


            boolean ok= false;
            int num1;
            int num2;
                do{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ingresa dos numeros");

                    try{


             num1= scanner.nextInt();

             num2= scanner.nextInt();
            ok=true;
            }catch(Exception e) {


                        System.out.println("Numeros incorrectos");

                    }
                }while(ok==false);

            InputStream fichero = new FileInputStream("Practicar programacion.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {

                int data = ficheroBuffer.read();

                while (data != -1) {

                    System.out.print((char)data);
                    data=ficheroBuffer.read();
                }
            }catch(IOException e){
                System.out.println("Nose puede leer" + e.getMessage());
            }
            //  System.out.println(new String(data));

        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }


            //Print Stream
        System.out.println("algo");
        PrintStream info= new PrintStream("copia.txt");
        info.println("hola");
*/

        InputStream in= new FileInputStream("Practicar programacion.txt");
        byte[]datos= in.readAllBytes();
        in.close();

        PrintStream out= new PrintStream("Destino.txt");
        out.write(datos);
        out.close();



    }
}
