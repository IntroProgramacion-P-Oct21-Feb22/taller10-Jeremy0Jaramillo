/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        int filas;
        int columnas;
        int indice;
        double suma;
        String cadena = "";

        for (filas = 0; filas < notas.length; filas++) {
            indice = filas;
            suma = 0;
            for (columnas = 0; columnas < notas[filas].length; columnas++) {
                suma = suma + notas[filas][columnas];
            }
            cadena = cadena + "Estudiante: " + estudiantes[indice] + " tiene un promedio de " + suma + "\n";
        }
        System.out.println(cadena);
    }

}
