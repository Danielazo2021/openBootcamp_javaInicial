package com.Errores;

import java.io.IOError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiposDeErrores {
    public static void main(String[] args) {
        int resultado=0;
        try {
           resultado= divide(4,0);
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public static int divide (int a, int b) throws ArithmeticException, IOException {
        int result=0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
           throw new IOException();
        }
        return result;
    }


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = scanner.nextInt();
        try {
            int result = numero / numero2; // si ingresa 0 es error en dividir por 0 , hay que validar los datos antes
            System.out.println("El resultado es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
        finally {
            System.out.println("Gracias por usar el programa, buen dia");
            scanner.close();
        }
*/
    }

        //runtime (como dividir por 0, no controlar los datos)
        //error de compilacion (nos olvidamos de poner un ; por ejemplo
        //error logico (cuando nos equivocamos en la logica




    //Los warning son los errorres como las clases que importamos y no usamos,
    // para ignorar un wartning en especifivo podemos poner un @suppressWarnings("rawtypes")// ejemplo lo del parentesis
     /*   public static void demoMapa(String[] args) {
            HashMap<String, Integer> map= new HashMap<>();


            map.put("Clave1", 10);
            map.put("Clave2", 20);
            map.put("Clave3", 30);
            map.put("Clave4", 40);

            System.out.println(map.get("Clave2"));
            map.replace("Clave2",150);
            System.out.println(map.get("Clave2"));
            map.remove("Clave3");

            System.out.println(map);

            for (Map.Entry<String, Integer> entry : map.entrySet())
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }


        }

    }*/

