package com.Harman.Harman2;

abstract class College {

    abstract void setAcademicFee();

}

class CSE_dept extends College
{
    void setAcademicFee(){

        System.out.println("100000");

    }


}

class ME_dept extends College
{
    void setAcademicFee() {

        System.out.println("75000");

    }
}

class CollegeOffice
{
    public static void main(String[] args) {

        College ob_cse = new CSE_dept();
        College ob_me = new ME_dept();
        System.out.println("The Computer Dept");
        ob_cse.setAcademicFee();
        System.out.println("The Mechanical Dept");
        ob_me.setAcademicFee();

    }


}