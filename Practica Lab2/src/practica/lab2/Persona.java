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
public class Persona {
    private double cedula;
    private String nombre;
    private int edad;
        public Persona(double c, String n, int e) {

        cedula = c;
        nombre = n;
        edad = e;
    }

    public void setcedula(double cedula) {
        this.cedula = cedula;

    }

    public double getcedula() {
        return cedula;
    }

    public String getnombre() {
        return nombre;

    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;

    }

    public void setedad(int edad) {
        this.edad = edad;
    }

}
