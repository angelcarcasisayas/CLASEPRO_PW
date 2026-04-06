package ejercicios;

import java.util.*;

public class CuadradoMagico {

    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);

        System.out.println("GENERADOR DE CUADRADOS MAGICOS");

        System.out.print("Ingresa el tamaño del cuadrado mágico: ");
        int n = Lector.nextInt();

        if (n < 3) {
            System.out.println("\nError: El tamaño debe ser al menos 3");
            return;
        }

        int[][] matriz = new int[n][n];
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= n * n; i++) {
            numeros.add(i);
        }

        int constMagica = n * (n * n + 1) / 2;
        int intentos = 0;

        boolean encontrado = false;
        while (!encontrado) {
            intentos++;

            Collections.shuffle(numeros);

            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = numeros.get(index++);
                }
            }

            boolean magico = true;

            // Filas
            for (int i = 0; i < n; i++) {
                int sumaFila = 0;
                for (int j = 0; j < n; j++) {
                    sumaFila += matriz[i][j];
                }
                if (sumaFila != constMagica) {
                    magico = false;
                    break;
                }
            }

            // Columnas
            if (magico) {
                for (int j = 0; j < n; j++) {
                    int sumaColumna = 0;
                    for (int i = 0; i < n; i++) {
                        sumaColumna += matriz[i][j];
                    }
                    if (sumaColumna != constMagica) {
                        magico = false;
                        break;
                    }
                }
            }

            // Diagonal 1
            if (magico) {
                int sumaDiagonal = 0;
                for (int i = 0; i < n; i++) {
                    sumaDiagonal += matriz[i][i];
                }
                if (sumaDiagonal != constMagica) {
                    magico = false;
                }
            }

            // Diagonal 2
            if (magico) {
                int sumaDiagonal2 = 0;
                for (int i = 0; i < n; i++) {
                    sumaDiagonal2 += matriz[i][n - 1 - i];
                }
                if (sumaDiagonal2 != constMagica) {
                    magico = false;
                }
            }

            if (magico) {
                encontrado = true;

                System.out.println("CUADRADO MÁGICO ENCONTRADO");

                for (int i = 0; i < n; i++) {
                    System.out.println("   ");
                    for (int j = 0; j < n; j++) {
                        System.out.printf(" %2d ", matriz[i][j]);
                    }
                    System.out.println("    ");
                }

                // Informacion
                System.out.println("Constante mágica: " + constMagica);
                System.out.println("Intentos realizados: " + intentos);

            }
        }
    }
}
