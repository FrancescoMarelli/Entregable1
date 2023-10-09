package Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int BINSORT = 1;
    static final int MATRIXMULTIPLY = 2;
    public static void main(String[] args) {
        System.out.println("Benvienido en el programa del método Plantilla");
        System.out.println("Con que algoritmo desea trabajar?");
        System.out.println("1. BinSort");
        System.out.println("2. MatrixMultiply");
        System.out.println("Marqué la opcion 1 o 2");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        Problem p = null;
        Solution s = null;
        DivConqTemplate dc = null;

        switch (opcion) {
            case BINSORT: {
                System.out.println("Ingrese el tamaño del vector");
                int n = sc.nextInt();
                ArrayList<Integer> disorderedArr = new ArrayList<Integer>();
                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese el elemento " + (i + 1));
                    disorderedArr.add(sc.nextInt());
                }
                p = new BinSortProb(disorderedArr);
                s = new BinSortSol(disorderedArr);
                dc = new BinSortDC();
                dc.solve(p);
                System.out.println(s);
                break;
            }
            case MATRIXMULTIPLY: {
                System.out.println("El numero de columnas de la matriz A debe ser igual al numero de filas de la matriz B");
                ArrayList<ArrayList<Integer>> matrixA = new ArrayList<ArrayList<Integer>>();
                //do a for to get two matrixes and get the size of the matrixes
                System.out.println("Ingrese el numero de filas  de la matriz A");
                int n = sc.nextInt();
                System.out.println("Ingrese el numero de columnas de la matriz A");
                int m = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    ArrayList<Integer> row = new ArrayList<Integer>();
                    for (int j = 0; j < m; j++) {
                        System.out.println("Ingrese el elemento " + (j + 1) + " de la fila " + (i + 1) + " de la matriz A");
                        row.add(sc.nextInt());
                    }
                    matrixA.add(row);
                }

                if (n != m) {
                    System.out.println("El numero de columnas de la matriz A debe ser igual al numero de filas de la matriz B");
                    break;
                }
                ArrayList<ArrayList<Integer>> matrixB = new ArrayList<ArrayList<Integer>>();
                System.out.println("Ingrese el numero de filas  de la matriz B");
                int n2 = sc.nextInt();
                System.out.println("Ingrese el numero de columnas de la matriz B ");
                int m2 = sc.nextInt();

                for (int i = 0; i < n2; i++) {
                    ArrayList<Integer> row = new ArrayList<Integer>();
                    for (int j = 0; j < m2; j++) {
                        System.out.println("Ingrese el elemento " + (j + 1) + " de la fila " + (i + 1) + " de la matrizB");
                        row.add(sc.nextInt());
                    }
                    matrixB.add(row);
                }
                p = new MatrixMultiplyProb(matrixA, matrixB);
                s = new MatrixMultiplySol(matrixA);
                dc = new MatrixMultiplyDC();
                dc.solve(p);
                System.out.println(s);
            break;
            }
            default:
                System.out.println("Opcion no valida");
        }

    }
}
