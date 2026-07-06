package technicalTasks;

import java.util.Scanner;

public class GuessTheWord {

    public static void main(String[] args) {

        game(makeWords());

    }


    public static String[] makeWords(){

        System.out.println("Задайте 20 слов.");
        String[] words = new String[20];
        Scanner sc = new Scanner(System.in);

        for (int count = 0; count < 20; count++) {
            System.out.println("Введите " + (count+1) + " слово: ");
            String word = sc.nextLine();
            while (word.length() < 3){
                System.out.println("Загаданное слово меньше 3 букв. Введите другое слово:");
                word = sc.nextLine();
            }
            words[count] = word;
        }

        return words;
    }

    public static void game(String[] words){

        String myWord = words[(int) (Math.random() * 20)];
        char[] terminalWord = new char[myWord.length()];
        int attempt = 5;
        boolean isRight = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Игра началась! Угадайте слово!");


        while (attempt > 0 && isRight == false){
            System.out.println(terminalWord);
            System.out.printf("""
                    Осталось попыток: %d
                    Введите букву или полное слово:
                    """,attempt);

            String hunch = sc.nextLine();

            while (hunch.length()!=1 && hunch.length()!=myWord.length()){
                System.out.println("Надо ввести полное слово или 1 букву!" +
                        "Введите снова:");
                hunch = sc.nextLine();
            }

            if (hunch.equalsIgnoreCase(myWord)){
                isRight = true;
            }
            else if (hunch.length() == myWord.length() && isRight == false){
                System.out.println("Догадка неправильная! :)");
            }

            if (hunch.length() == 1){
                int index = myWord.indexOf(hunch);

                if (index == -1){
                    System.out.println("Такой буквы нет в слове!");
                }
                else{
                    terminalWord[index] = hunch.charAt(0);
                    boolean isAny = false;
                    isRight = true;

                    for (char symbol : terminalWord) {
                        if (symbol == '\0') {
                            isAny = true;
                            break;
                        }
                    }
                    if (isAny){
                        isRight = false;
                    }

                }

            }
            attempt--;
        }
        if (isRight == true){
            System.out.printf("""
                    Победа!
                    Вы угадали слово!
                    Загаданное слово: %s
                    """,myWord);
        }
        else{
            System.out.printf("""
                    Вы не угадали слово!
                    Загаданное слово: %s
                    """,myWord);

        }

    }


}
