/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algortimos.pkg24;

/**
 *
 * @author ucr
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 20;
        int[][] matriz = new int[tam][tam];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        int sumaDiagonal = sumaDiagonal(matriz);
        System.out.println("Suma Diagonal = " + sumaDiagonal);
        System.out.println("---------------------");
        int sumaDiagonalM = sumaDiagonalM(matriz, tam, 0,0);
        System.out.println("Suma Diagonal = " + sumaDiagonalM);

    }

    private static void llenarMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int var = (int) (Math.random() * 10);
                matriz[i][j] = var;
            }
        }
    }

    private static void mostrarMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);

            }
            System.out.println("");
        }

    }

    private static int sumaDiagonal(int[][] matriz) {       // 1
        int suma = 0;                                       // 1
        for (int i = 0; i < matriz.length; i++) {           // 1 + 4n
            for (int j = 0; j < matriz[0].length; j++) {    // 1 + 4n
                if (i == j) {                               // 1 n2
                    suma += matriz[i][j];                   // 4 n2
                }
            }
        }                  //(4n+1)(4n+1) =  5n2 + 16n2 +4n +4n + 1 -- 21 n2 + 8 n + 1

        return suma; // 1 
          //  21 n2 + 8 n + 4   ------   (n2)  -- -----
    }

    private static int sumaDiagonalM(int[][] matriz, int tam, int suma, int i) { // 1
        for (;i < tam; i++)  // 3n 
            suma += matriz[i][i];     // 4n

        return suma; // 1
    }
    //  7n + 2

}