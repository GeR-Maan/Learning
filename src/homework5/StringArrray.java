package homework5;

public class StringArrray {

    public static void main(String[] args) {

        String[][] array = new String[8][8];
        //Создаём массив
        makeStringArray(array);
        // Выводим
        printArray(array);


    }


    public static void makeStringArray(String[][] array) {
        //Берем флаг как ориентир по смене букв
        boolean flag = true;
        // Заполняем массив
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
                ;
            }
        }

    }

    public static void printArray(String[][] array) {
        System.out.println("Массив: ");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }



/*    public static void makeZipper(int[][] array) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = i;

                if (i % 2 == 0) {

                }
            }
        }
    }*/


}
