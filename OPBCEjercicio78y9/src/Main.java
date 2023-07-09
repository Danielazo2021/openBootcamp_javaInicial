import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1.Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] nombres = {"pedro", "Juan", "Jose", "Toribio"};


        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //2 Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] numeros = new int[2][4];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 30;
        numeros[1][1] = 70;
        numeros[1][2] = 30;
        numeros[1][3] = 800;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                {
                    System.out.println("Posicion:" + i + " " + j + " n° " + numeros[i][j]);
                }
            }

        }

        //3 Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final

        Vector<Integer> vector = new Vector<>();
        vector.add(16);
        vector.add(52);
        vector.add(423);
        vector.add(43);
        vector.add(25);

        vector.remove(2);
        vector.remove(3);
        System.out.println("Los datos de veector son " + vector);

        //4 Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
        // 1000 elementos para ser añadidos al mismo.

        // El problema seria la cantidad de veces que se tiene que redimensionar y acer copias en memoria.


        //5 Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.


        ArrayList<String> list = new ArrayList<String>();
        list.add("Daniel");
        list.add("Jorge");
        list.add("Pedro");
        list.add("Jeny");

        LinkedList<String> linkedlist = new LinkedList<>();


        for (String item : list) {
            linkedlist.add(item);
            System.out.println(item);

        }

        for (String linked : linkedlist) {
            System.out.println(linked);
        }

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el
        // ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        // el primer "for" de relleno.

        ArrayList<Integer> misNumeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0) {
                misNumeros.add(i + 1);
            }

        }

        System.out.print("Los numeros pares que se incluyeron en el array list son: ");
        for (int item : misNumeros) {
            System.out.print(item + " ");
        }
        System.out.println();
        // 7 Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".

        double resultado = 0;
        try {
            resultado = DividePorCero(5, 0);
        } catch
        (ArithmeticException e) {
            System.out.println(" error " + e);
        }


        System.out.println("El resultado es" + resultado);

        //8 Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        // dado en "fileOut".

        byte[] data = new byte[10000];
        try {
            InputStream fichero = new FileInputStream("Practicar programacion.txt");
            try {
                byte[] datos = fichero.readAllBytes();
                for (byte miDato : datos) {
                    System.out.println((char) miDato);
                }
                try {
                    InputStream fichero2 = new FileInputStream("Practicar programacion.txt");
                    try {
                        byte datos2[] = new byte[5];// esto seria para leer de 5 en 5, pero no lo termine de hacer
                        int data3 = fichero2.read();

                        while (data3 != -1) {

                            System.out.print((char) data3);
                            data3 = fichero2.read();
                        }
                    } catch (IOException e) {
                        System.out.println("Nose puede leer" + e.getMessage());
                    }
                    System.out.println(new String(data));

                } catch (FileNotFoundException e) {
                    System.out.println("El programa da error: " + e.getMessage());
                }


            } finally {
                System.out.println("fin?");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("fin?");
        }


        InputStream in= new FileInputStream("Practicar programacion.txt");
        byte[]datos= in.readAllBytes();
        in.close();

        PrintStream out= new PrintStream("Destino.txt");
        out.write(datos);
        out.close();


    }








    public static double DividePorCero(int a, int b) throws ArithmeticException {
    int result=0;
    try{
        result = a/b;
    }catch(ArithmeticException e){
        throw new ArithmeticException();
    }

        return result;
    }
}