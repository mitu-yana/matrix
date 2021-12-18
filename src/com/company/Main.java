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
        for (int i = 0; i < str; i++){  // идём по строкам
            for (int j = 0; j < stlb;  j++){  // идём по столбцам
                System.out.println("введите элемент матрицы");
                twoDimArray[i][j]=L.nextDouble();
            }
            }
            for (int i = 0; i < str; i++){  // идём по строкам
                for (int j = 0; j < stlb;  j++){  // идём по столбцам
                System.out.printf(" %.2f ",twoDimArray[ i][j]*3);  // вывод элемента
            }
            System.out.println(); // перенос строки ради визуального сохранения табличной формы
        }
    }
}
