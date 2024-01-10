package OOPS;

import java.util.Scanner;

public class Parent {
    void vish(int ro) {
        for (int i = 0; i <= ro; i++) {
            System.out.println(i);
        }
    }
}
class child2{
    void omya(){
        System.out.println("omya patil");
    }
    static void ps(){
        System.out.println("patilllllll");
    }

   ;
}
class child1{


    int var8=100;

      int a(){
          System.out.println("rohit ");
          return 0;
      }
      static void panu(){
          System.out.println("sabse hatke");
      }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");

        int in = sc.nextInt();
        Parent obj = new Parent();
        obj.vish(in);


        child1 obj2= new child1();
        obj2.a();
         child1.panu();
         obj2.var8=110;




         child2 obj4=new child2();
         obj4.omya();

         child2.ps();









    }

  }













