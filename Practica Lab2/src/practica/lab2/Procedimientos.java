/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;
import java.util.Scanner;
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
        
     public void Programa2(){
        Scanner lector = new Scanner (System.in);
        String frase=" ";
        char [] caracteres;
        int repetido =0;
        char caractermasrepetido=' ';
        int contador=0;
        System.out.println("escriba su texto");
        frase=lector.nextLine();
        frase =frase.toLowerCase();
        caracteres=frase.toCharArray();
        for(int i=0; i<caracteres.length; i++){
            char actual=caracteres[i];
            contador =0;
            for(int j=0; j<caracteres.length; j++){
                if (caracteres[j]==actual)
                    contador++;
            }
            if (repetido<contador){
                repetido=contador;
                caractermasrepetido=actual;
            }
        }
        for(int i=0; i<caracteres.length; i++){
            frase = frase.replace('a', caractermasrepetido).replace('e', caractermasrepetido).replace('i', caractermasrepetido).replace('o', caractermasrepetido).replace('u', caractermasrepetido);
            
           
        }
        System.out.println(frase);
       
     }
      
   

        
}


    

