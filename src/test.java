
import java.io.*;
class test {
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int c;
        System.out.println("enter how many no.s  u want to check ");
        c = Integer.parseInt(in.readLine());

        int i;
        for (i=1;i<=c;i++)
        {
            int a;
            System.out.println("enter no.");
            a = Integer.parseInt(in.readLine());


        if (a % 2 == 0){
        System.out.println("even");}
        else {
        System.out.println("odd");
        }}
    }}

