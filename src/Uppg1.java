import javax.swing.*;
import java.util.Scanner;

/**
 * Created by maal15 on 2016-11-28.
 */
public class Uppg1 {

    public static void main(String[] args) {
            Scanner src = new Scanner(System.in);

            System.out.println("Vilken uppgift vill du köra? Välj mellan 1-3");

            int input = src.nextInt();



            if (input == 1) {
                del1();
            } else if (input == 2) {
                    del2();
            } else if (input == 3) {
                del3();
            } else {
                System.out.println("Du angav inte 1,2 eller 3. Var god starta om programet.");
            }


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
        double summa = 0;

        double num = 1;

        while((1/num) > 0.00001) {
            summa += (1/num);
            num++;
            summa -= (1/num);
            num++;

        }

        System.out.println(summa + " " + num);

    }


    //Uppgift 5.8
    public static void del3() {
        Scanner s =  new Scanner(System.in);

        System.out.println("Enter a string");

        String input = s.nextLine();

        char[] inputchar = new char[input.length()]; //inputet i en char array

        char[] outputchar = new char[input.length()]; //inputet baklänges.

        inputchar = input.toCharArray();


        for(int i = input.length()-1; i >= 0; i--) { //gör ordet baklänges

            outputchar[(input.length()-i - 1)] = inputchar[i];
        }
        if (input.equalsIgnoreCase(String.valueOf(outputchar))) { //kollar om ordet är samma baklänges

            System.out.println("same");

        } else {
            System.out.println("not same");
        }

    }
}
