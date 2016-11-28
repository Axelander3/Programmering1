import java.util.Scanner;

/**
 * Created by maal15 on 2016-11-28.
 */
public class Uppg1 {

    public static void main(String[] args) {
            del1();



    }


    // Uppgift 5.5
    public static void del1() {
        Scanner src = new Scanner(System.in);

        System.out.println("Hur många rader vill du ha?");

        int lines = src.nextInt();

        System.out.println("Skriver ut " + lines + " rader!");

        for(int i =1; i<(lines+1);i++) {
            printLines(i);
            System.out.println(" ");
        }
    }
    public static void printLines(int num) {
        System.out.print(num + " ");
        for (int i=1; i<num;i++) {
            int test = num*i;
            System.out.print(num+test + " ");

        }
    }


    //Uppgift 5.7
    public static void del2() {



    }


    //Uppgift 5.8
    public static void del3() {



    }
}
