import java.util.*;
import java.util.Scanner;

class pro
{

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        while  (true) {
            System.out.println("Enter the operation u want to choose");

            System.out.println("'+' , '-' , '*',  '/ ' ");

            char ch;
            ch = sc.next().charAt(0);
            if ((ch != '+') && (ch != '/') && (ch != '*') && (ch != '-')) {
                System.out.println("NO OPTION");

                return;
            }
            int a, b;


            System.out.println("Enter 2 no.");
            a = sc.nextInt();
            b = sc.nextInt();


            switch (ch) {
                case '+':
                    int c = a + b;
                    System.out.println("SUM OF 2 NO. IS " + c);
                    break;
                case '-':
                    int k = a - b;
                    System.out.println("DIFFRENCE OF 2 NO. IS " + k);
                    break;
                case '*':
                    int q = a * b;
                    System.out.println("MULTIPLICATION  OF 2 NO. IS " + q);
                    break;
                case '/':
                    float l =(float) a / b;
                    System.out.println("DIVISION OF 2 NO. IS " + l);
                    break;

            }
        }




    }}
