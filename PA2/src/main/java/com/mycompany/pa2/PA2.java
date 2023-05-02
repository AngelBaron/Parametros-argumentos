/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pa2;

/**
 *
 * @author lucho
 */
public class PA2 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int resultado = suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
