package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("введите количество строк");
        Scanner L = new Scanner(System.in);
        int str = L.nextInt();
        System.out.println("введите количество столбцов");
        int stlb = L.nextInt();
        double[][] twoDimArray = new double[str][stlb];
        for (int i = 0; i < str; i++){
            for (int j = 0; j < stlb;  j++){
                System.out.printf("введите элемент матрицы [%d][%d]\n", i+1, j+1);
                twoDimArray[i][j]=L.nextDouble();
            }
            }
                for (int j = 0; j < stlb;  j++){
                System.out.printf(" %.2f ",twoDimArray[0][j]*3);
            }

    }
}
