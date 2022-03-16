package com.Harman.Harman2;

public interface RBI {
    void SetInterestRate();
}
class SBI implements RBI{

    public void SetInterestRate() {

        System.out.println("7% interest");

    }
}
class ICICI implements RBI{

    public void SetInterestRate() {

        System.out.println("7.5% interest");

    }

        }


       class Person
       {
           public static void main(String[] args) {
               RBI ob_Sbi = new SBI();
               RBI ob_Icici = new ICICI();
               System.out.println("The interest rate of SBI:-");
               ob_Sbi.SetInterestRate();
               System.out.println("The interest rate of ICICI:-");
               ob_Icici.SetInterestRate();

           }


       }