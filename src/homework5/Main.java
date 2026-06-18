package homework5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[4][4];


    }

    public static void makeArray(int[][] array){
        System.out.println("-".repeat(50));

        System.out.println("Создаём массив...");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }

        }
        System.out.println("Массив создан");
        System.out.println("-".repeat(50));

    }

    public static void summeringVariableToArray(int[][] array){

        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(50));

        System.out.println("Напишите число, которое вы хотите " +
                "прибавить к каждому элементу массива");

        int variable = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + variable;
            }
        }
        System.out.println("Значение прибавлено");
        System.out.println("-".repeat(50));
    }

    public static void summeringOfArray(int[][] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма чисел в массиве: " + sum);
        System.out.println("-".repeat(50));

    }

    public static void printArray(int[][] array){

        System.out.println("Двумерный массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }


}
