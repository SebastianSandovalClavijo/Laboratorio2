/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;

import java.util.Scanner;

/*Escriba un programa que calcule la media, varianza y desviación estándar
de un arreglo de números enteros aleatorios. El usuario debe ingresar el
tamaño del arreglo.
/**
 *
 * @author SANDOVAL
 */
public class PracticaLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Procedimientos model = new Procedimientos();
        Scanner teclado = new Scanner(System.in);
        String opc;
        System.out.println("=== MENU ===");
        System.out.println();
        System.out.println("1.Programa");
        System.out.println("2.Programa");
        System.out.println("4.Programa");

        System.out.print("Digite la opcion ");
        opc = teclado.nextLine();
        switch (opc) {
            case "1":
                int tamaño;

                System.out.println();
                System.out.print("Cual es el tamaño del arreglo ");
                tamaño = teclado.nextInt();
                int[] arreglo = new int[tamaño];
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println();
                    System.out.print("Digite el " + (i + 1) + " numero ");
                    arreglo[i] = teclado.nextInt();

                }

                System.out.println();
                System.out.println("Resultado Media " + model.Media(arreglo));
                System.out.println();
                System.out.println("Resultado Variacion " + model.Varianza(arreglo));
                System.out.println();
                System.out.println("Resultado Desviacion Estandar " + model.DesviacionEstandar());
                break;
            case "2":

                model.Programa2();
                break;
            case "4":
                Scanner sc = new Scanner(System.in);
                int num;
                System.out.print("Ingrese el numero de personas a las que vamos a tomarles datos: ");
                num = sc.nextInt();

                Persona arreglo1[] = new Persona[num];
                String nombre;
                int edad;
                double cedula;

                for (int i = 0; i < arreglo1.length; i++) {
                    sc.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese la edad: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese la cedula: ");
                    cedula = sc.nextDouble();
                    arreglo1[i] = new Persona(cedula, nombre, edad);

                }
                for (int j = 0; j < arreglo1.length; j++) {
                    System.out.println("-----------------------");
                    System.out.println("Cedula   nombre   edad  ");
                    System.out.println(arreglo1[j].getcedula() + "   " + arreglo1[j].getnombre() + "   " + arreglo1[j].getedad());

                    break;

                }

        }

    }
}
