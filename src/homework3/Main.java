package homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        taskFive();

    }


    public static void taskOne(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("четное");
        }else{
            System.out.println("Нечётное");
        }

    }

    public static void taskTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int t = sc.nextInt();
        if(t > -5){
            System.out.println("Warm");
        }else if(t >-20){
            System.out.println("Normal");
        }else {
            System.out.println("Cold");
        }

    }

    public static void taskThree(){

        for (int i = 10; i <=20;i++){
            System.out.println(i*i);
        }

    }

    public static void taskFour(){
        int number = 7;
        int sum = 0;
        while (sum != 98){
            sum = sum+number;
            System.out.print(sum + "\t");
        }
    }

    public static void taskFive(){

        Scanner sc = new Scanner(System.in);
        boolean isWrong = true;
        int number;
        int sum = 0;

        do {
            System.out.print("Enter number:");
            number = sc.nextInt();
            if(number >= 0){
                isWrong = false;
            }
        }while(isWrong);

        for (int count = 0; count <= number; count++){
            sum = sum + count;
        }
        System.out.println(sum);

    }

}
