package homework5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[4][4];

        makeArray(array);
        printArray(array);
        summeringVariableToArray(array);
        printArray(array);
        summeringOfArray(array);


        String[][] stringArray = new String[8][8];

        makeStringArray(stringArray);

        printStringArray(stringArray);

        makeZipper(4,5);

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
            System.out.println();
        }
    }

    public static void makeStringArray(String[][] array) {
        //Берем флаг как ориентир по смене букв
        boolean flag;
        // Заполняем массив
        System.out.println("-".repeat(30));
        System.out.println("Заполняем шахматную доску...");
        for (int i = 0; i < 8; i++) {

            if (i % 2 == 0) {
                flag = false;
            }
            else{
                flag = true;
            }

            for (int j = 0; j < 8; j++) {

                if (flag) {
                    array[i][j] = "B";
                    flag = false;
                }
                else{
                    array[i][j] = "W";
                    flag = true;
                }

            }
        }

    }

    public static void printStringArray(String[][] array) {
        System.out.println("-".repeat(30));
        System.out.println("Массив: ");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void makeZipper(int columns, int lines) {

        int[][] array = new int[columns][lines];
        // Берём обычный счётчик
        int count = 0;

        for (int i = 0; i < columns; i++) {

            if (i % 2 == 0) {
                // Четную заполняем слева направо
                for (int j = 0; j < lines; j++) {
                    array[i][j] = count++;
                }
            } else {
                // Нечетную наоборот
                for (int j = lines - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }

        // Вывод
        System.out.println("-".repeat(30));
        System.out.println("Вывод массива:");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }


}



