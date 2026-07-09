package technicalTasks;

import java.util.Scanner;

public class GuessTheWord {

    public static void main(String[] args) {

        playGame();

    }

    /*
    1) Создать слово  YES
    2) Сделать набор из 20 слов YES
    3) Вытащить одно слово на рандом как загаданное YES
    4) Правильная буква или нет  YES
    5) Угадал или нет слово   YES
    6) Есть ли закрытые буквы YES
    7) главная логика игры  YES
     */

    public static String createWord() {

        Scanner sc = new Scanner(System.in);
        String word;
        word = sc.nextLine();

        return word;
    }


    public static String[] makeWords() {

        System.out.println("Задайте 20 слов.");
        String[] words = new String[20];


        for (int count = 0; count < 20; count++) {
            System.out.println("Введите " + (count + 1) + " слово: ");
            String word = createWord();

            while (word.length() < 3) {
                System.out.println("Загаданное слово меньше 3 букв. Введите другое слово:");
                word = createWord();
            }
            words[count] = word;
        }

        return words;
    }

    public static String chooseWord(String[] words) {
        return words[(int) (Math.random() * 20)];
    }

    public static String getGuessInput(int targetLength) {

        String guessInput = createWord();

        while (guessInput.length() != 1 && guessInput.length() != targetLength) {

            System.out.println("Введите 1 букву или сразу слово:");
            guessInput = createWord();

        }

        return guessInput;

    }


    public static boolean isRightLetter(char ch, String rightWord) {

        int index = rightWord.indexOf(ch);

        if (index == -1) {
            return false;
        } else {
            return true;
        }
    }


    public static boolean isRightWord(String guess, String rightWord) {
        return guess.equalsIgnoreCase(rightWord);
    }

    public static boolean isLettersClosed(char[] mask) {
        for (char symbol : mask) {
            if (symbol == '*') {
                return true;
            }
        }
        return false;
    }


    public static void playGame() {

        Scanner sc = new Scanner(System.in);
        String[] words = makeWords();

        while (true) {
            String secretWord = chooseWord(words);
            char[] mask = new char[secretWord.length()];

            for (int i = 0; i < mask.length; i++) {
                mask[i] = '*';
            }

            int attempts = 5;
            System.out.println("\n=== Игра началась! Угадайте слово! ===");

            while (attempts > 0) {
                System.out.println("Слово: " + String.valueOf(mask));
                System.out.println("Осталось попыток: " + attempts);

                String guess = getGuessInput(secretWord.length());

                if (guess.length() == 1) {
                    char letter = guess.charAt(0);

                    if (isRightLetter(letter, secretWord)) {

                        for (int i = 0; i < secretWord.length(); i++) {
                            if (Character.toLowerCase(secretWord.charAt(i)) == Character.toLowerCase(letter)) {
                                mask[i] = secretWord.charAt(i);
                            }
                        }
                        attempts--;
                    } else {
                        System.out.println("Такой буквы нет!");
                        attempts--;
                    }
                } else {

                    if (isRightWord(guess, secretWord)) {
                        System.out.println("\nПОБЕДА! Вы угадали слово: " + secretWord);
                        break;
                    } else {
                        System.out.println("Слово неверное!");
                        attempts--;
                    }
                }

                if (!isLettersClosed(mask)) {
                    System.out.println("\nПОБЕДА! Вы угадали слово по буквам: " + secretWord);
                    break;
                }
            }

            if (attempts == 0) {
                System.out.println("\nВЫ ПРОИГРАЛИ! Загаданное слово было: " + secretWord);

                System.out.println("\nХотите начать заново? (Да/Нет)");
                String answer = sc.nextLine();
                if (!answer.equalsIgnoreCase("Да")) {
                    System.out.println("Прощайте, до свидания.");
                    break;
                }
            } else {
                break;
            }
        }
    }



}