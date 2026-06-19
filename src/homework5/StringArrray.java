package homework5;

public class StringArrray {

    public static void main(String[] args) {

/*        String[][] array = new String[8][8];
        //Создаём массив
        makeStringArray(array);
        // Выводим
        printArray(array);*/

        makeZipper(4,5);

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

    public static void printArray(String[][] array) {
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
