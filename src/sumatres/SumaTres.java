/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatres;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class SumaTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        int suma1 = num1 + num2;
        int suma2 = num2 + num3;
        int suma3 = num1 + num3;

        if (suma2 == num1) {
            System.out.printf("la suma de el numero" + num2 + " y " + num3 + " es igual a " + num1);

        } else if (suma1 == num3) {

            System.out.println("La suma de el numero " + num1 + " y " + num2 + " es igual a" + num3);

        } else if (suma3 == num2) {
            System.out.println("La suma de el numero " + num1 + " y " + num3 + " es igual a " + num2);
        } else {
            System.out.println("Las sumas no coinciden");
        }

    }

}
