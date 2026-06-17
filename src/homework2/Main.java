package homework2;

public class Main {
    public static void main(String[] args) {

        calculateA();

    }


    public static void calculateA(){

        int b = 5;
        int c = 3;

        int a = 4*(b+c-1)/2;
        System.out.println(a);
    }

    public static void taskTwo(){

        int n = 34;

        int first  = n /10;
        int second = n %10;

        System.out.println(first+second);
    }


    public static void taskThree(){

        int number = 123;

        int first  = number/100;
        int second = (number-(first*100))/10;
        int third = number%10;

        System.out.println(first+second+third);
    }

    public static void taskFour(){

        double numDouble = 3.6;

        System.out.printf("%.0f", numDouble);

    }

    public static void taskFive(){

        int q = 14;
        int w = 11;

        System.out.printf("%d и %d в остатке", q/w,q%w );

    }

    public static void taskSixLight(){

        int first = 1;
        int second = 2;
        int number;

        number = second;
        second = first;
        first = number;

        System.out.println(first + "  " + second);
    }

    public static void taskSixHard(){

        int first = 1;
        int second = 2;

        second = second - first;

        first = first + second;

        System.out.println(first + "  " + second);

    }
}