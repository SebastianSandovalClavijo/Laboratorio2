/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;

/**
 *
 * @author SANDOVAL
 */
public class Procedimientos {

    int media;
    double varianza;

    public int Media(int[] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {

            suma = arreglo[i] + suma;

        }
        media = Math.round(suma / arreglo.length);
        return media;

    }

    public int Varianza(int[] arreglo) {
        double sumatoria = 0;

        for (int i = 0; i < arreglo.length; i++) {

            sumatoria = sumatoria + Math.pow((arreglo[i] - this.media), 2);
            System.out.println(sumatoria);

        }

        varianza = Math.round(sumatoria / arreglo.length);

        return (int) varianza;

    }

    public int DesviacionEstandar() {

        double desviacion = Math.sqrt(varianza);

        return (int) desviacion;

    }
}
