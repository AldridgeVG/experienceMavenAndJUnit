package hello;

import org.apache.commons.math3.util.ArithmeticUtils;

import java.util.Scanner;

public class gcd {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("input 2 integers below:");
        int m = in.nextInt();
        int n = in.nextInt();

        int a = ArithmeticUtils.gcd(m,n);
        System.out.println("this is their greatest common division: "+a);
    }

}
