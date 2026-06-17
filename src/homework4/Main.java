package homework4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Напишите длину массива");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] array = new int[length];

        makeArray(array);

        readAndWriteCurrentA(array);

/*        readAndWriteReverse(array);

        printMinAndMax(array);

        printMinAndMaxIndexes(array);

        replaceElements(array);

        chekIf(array);*/

        remakeArray(array);



    }

    public static void makeArray(int[] array) {

        boolean flag = true;
        do {
            System.out.println("Как вы бы хотели заполнить массив?" +
                    "1. Руками" +
                    "2. Рандомно");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    for (int i = 0; i < array.length; i++) {
                        array[i] = sc.nextInt();
                    }
                    flag = false;
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 10);
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Не та цифра :)");
            }


        }while (flag);
    }


    public static void readAndWriteCurrentA(int[] array){

        System.out.println("Вывод массива в прямом порядке");
        for (int a: array){
            System.out.print(a + " ");
        }
        System.out.println();

    }

    public static void readAndWriteReverse(int[] array){


        System.out.println("Вывод массива в обратном порядке");

        for (int a = array.length-1; a>=0; a--){
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }

    public static void printMinAndMax(int[] array){

        int min = array[0];
        int max = array[0];

        for (int a: array){

            if (a > max){
                max = a;
            }if (a < min){
                min = a;
            }

        }
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    public static void printMinAndMaxIndexes(int[] array){

        int min = 0;
        int max = 0;

        for (int count = 0; count < array.length; count++){


            if (array[count] < array[min]){
                min = count;
            }
            if (array[count] > array[max]){
                max = count;
            }

        }
        System.out.println("Индекс минимума: " + min);
        System.out.println("Индекс максимума: " + max);
    }

    public static void findZeros(int[] array){

        int sum = 0;

        for ( int counter: array){
            if (counter == 0){
                sum++;
            }
        }
        if (sum == 0){
            System.out.println("Нолей в массиве нет");
        }

    }

    public static void replaceElements(int[] array){

        int variable;

        for (int first = 0, last = array.length-1; first < array.length/2 || last > array.length/2; first++,last--){
            variable = array[first];
            array[first] = array[last];
            array[last] = variable;
        }

        System.out.println("Вывод с перестановкой элементов");

        for (int a: array){
            System.out.print(a + " ");
        }

    }

    public static void chekIf(int[] array){
        boolean isTrue = true;

        for (int count = 0; count < array.length; count++){

            int first = array[count];
            int second = array[count+1];

            if (first > second){
                isTrue = false;
                break;
            }



        }
        if (isTrue){
            System.out.println("Возрастающая последовательность");
        }
        else{
            System.out.println("Не восходящая последовательность");
        }

    }

    // Тут просто использовал тот массив, который у нас уже есть
    // (если числа в массиве у нас от 0 до 9)
    public static void remakeArray(int[] array){
        int[] array2 = new int[0];

        while (array[0] == 0){
            array[0] = (int) (Math.random() * 10);
        }

        array[array.length-1] = array[array.length-1] + 1;

        for (int count = array.length-1; count > 0; count--){

            if (array[count] == 10){
                array[count] = 0;
                array[count-1] = array[count-1] + 1;
            }

        }
        if (array[0] == 10){

            array[0] = 0;
            array2 = new int[array.length + 1];
            array2[0] = 1;
        }
        if (array2.length > 0) {

            for (int a: array2){
                System.out.print(a + " ");
            }
        } else {

            for (int a: array){
                System.out.print(a + " ");
            }
        }
    }


}
