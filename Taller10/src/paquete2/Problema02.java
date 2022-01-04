/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Hyde", "Robert Wallace"};
        int filas;
        int columnas;
        int indice;
        double suma = 0;
        String cadena = "";

        for (filas = 0; filas < ventas.length; filas++) {
            indice = filas;
            for (columnas = 0; columnas < ventas[filas].length; columnas++) {
                System.out.printf("Ingrese las ventas de %s\n", vendedores[indice]);
                ventas[filas][columnas] = entrada.nextInt();
                suma = suma + ventas[filas][columnas];
            }
            cadena = cadena + "Vendedor(a): " + vendedores[indice] + "\n";
        }
        System.out.printf(cadena + " Ha realizado un total de " + suma + " en ventas.\n");
    }
}
