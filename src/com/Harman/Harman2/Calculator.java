package com.Harman.Harman2;

import java.nio.channels.CancelledKeyException;
import java.util.Scanner;

public class Calculator extends Parentcal {



    public static void main(String[] args) {
        Calculator ob = new Calculator();
        Scanner input = new Scanner(System.in);
        int n1,n2,sum;
        int sub,mul,div;
        System.out.println("Enter the num1");
        n1=input.nextInt();
        System.out.println("Enter the num2");
        n2=input.nextInt();
        sum=ob.AdditionOperation(n1 , n2);
        sub=ob.SubtractionOperation(n1 , n2);
        mul=ob.MultiplicationOperation(n1 , n2);
        div=ob.DivisionOperation(n1 , n2);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }

}
