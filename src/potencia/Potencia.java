/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.util.Scanner;

/**
 *
 * @author HACKER
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base;
        double exponente;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero base.");
        base = leer.nextDouble();
        System.out.println("ingrese el valor del exponente.");
        exponente = leer.nextDouble();
        System.out.println("la potencia es:"+ potencia(base,exponente));
    }

    public static double potencia(double Base, double Exponente) {//metodo recursivo
        if (Exponente == 0) {//condicion o caso base
            return 1;
        } else {
            return Base * potencia(Base, Exponente - 1);//se llama asi mismo el metodo calculando la potencia y creando un bucle el cual terminara cumpliendose la condicion.

        }
    }

}
