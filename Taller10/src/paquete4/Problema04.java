/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valoringresado;
        double[][] datos = new double[2][2];

        for (int filas = 0; filas < datos.length; filas++) {
            for (int columnas = 0; columnas < datos[filas].length; columnas++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:\n",
                        filas, columnas);
                valoringresado = entrada.nextInt();
                datos[filas][columnas] = valoringresado;
            }
            System.out.println();
        }
        System.out.println("El arreglo que ha ingresado es:");
        for (int filas = 0; filas < datos.length; filas++) {
            for (int columnas = 0; columnas < datos[filas].length; columnas++) {
                System.out.printf("%.2f\t", datos[filas][columnas]);
            }
            System.out.println();
        }
    }
}
