package com.Harman.Harman2;

 class Base {

     void display()
     {
         System.out.println("Parent Class");
     }
}

class Child extends Base{

    @Override
    void display() {
        super.display();
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }

}
