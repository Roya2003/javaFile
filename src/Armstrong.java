

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {

    static boolean EvenOrOdd(int panu){
        if (panu % 2 == 0){
            return true;

        } return false;

    }

    void number(int rohit) {

        for (int i=0;i<=rohit;i++){
            System.out.println(i);

        }

    }

    int ArmstrongNo(int val){
        int com=0;
        int r=0;
        int k=val;

        while (val > 0){

            r=val%10;
            com=r*r*r+com;
            val=val/10;

        }
        if (k==com){
            System.out.println("armstrong number");
        }else {
            System.out.println(" not Armstrong number ");
        }
        return 0;
    }

    void ReverseNumber(int Num4) {
        int Ans = 0;
        while ( Num4 != 0) {
            int remainder =  Num4 % 10;
            Ans = Ans * 10 + remainder;
            Num4 =  Num4 / 10;

        }
        System.out.println(Ans);
    }


    public static void main(String[] args) throws IOException {
        char c='y';
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number for checking even or odd");
            int num1=Integer.parseInt(br.readLine());
            boolean ans = Armstrong.EvenOrOdd(num1);
            if (ans){
                System.out.println("even number");
            }
            else {System.out.println("odd number");}



            System.out.println(" ");
            System.out.println("enter the number for printing all number");
            int num2=Integer.parseInt(br.readLine());
            Armstrong obj1=new  Armstrong();
            obj1.number(num2);



            System.out.println(" ");
            System.out.println("enter a Armstrong number");
            int num3=Integer.parseInt(br.readLine());
            Armstrong obj2 =new  Armstrong();
            obj2.ArmstrongNo(num3);


            System.out.println("Enter a reverse number");
            int num4=Integer.parseInt(br.readLine());
            Armstrong obj3=new  Armstrong();
            obj3.ReverseNumber(num4);


            System.out.println(" ");
            System.out.println("do you want continue");
            int omya= br.read();
            c=(char)omya;
            br.skip(1);
        }while ( c=='y'|| c=='Y');

    }
}

