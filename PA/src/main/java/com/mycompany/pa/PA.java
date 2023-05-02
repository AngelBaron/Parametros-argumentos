/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pa;

/**
 *
 * @author lucho
 */
public class PA {

   public static int suma(int a, int b) {
    int resultado = a + b;
    return resultado;
  }

  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 10;
    int res = suma(num1, num2);
    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + res);
  }
}
