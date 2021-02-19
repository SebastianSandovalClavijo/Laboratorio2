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
    String varianza;   
    public int Media(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {

            suma = arreglo[i] + suma;

        }
        media = (suma / arreglo.length);
        return media;
    }

    public int Varianza(int[] arreglo) {
        Procedimientos model = new Procedimientos();
        double sumatoria;
        
        for (int i = 0; i < arreglo.length; i++) {

            sumatoria = Math.pow((arreglo[i] - media), 2);
            varianza = varianza + arreglo[i];
        }
return (Integer.parseInt(varianza)/(arreglo.length-1));
    }
public double DesviacionEstandar(){

double desviacion=Math.sqrt(Double.parseDouble(varianza));

double redondeo=Math.rint(desviacion*100)/100;
return redondeo;
    
}
  

}
