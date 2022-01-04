/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        for (int filas = 0; filas < estudiantes.length; filas++) {
            for (int columnas = 0; columnas < estudiantes[filas].length; columnas++) {
                if ((estudiantes[filas][columnas].charAt(0) == 'S') || (estudiantes[filas][columnas].charAt(0) == 'P')
                        || (estudiantes[filas][columnas].charAt(0) == 'T')) {
                    System.out.printf("%s\n", estudiantes[filas][columnas]);
                }
            }
        }
    }
}
