package OOPS;

public class practice {

    static {
        System.out.println("static first");
    }




}

class childa{

    void  roh(){
        System.out.println("child A");

    }


}

class childb extends practice {

    static {
        System.out.println("child B");
    }


    childb(){
        System.out.println("constructor");
    }

    void ma(){
        System.out.println("roya ");
    }



}

class childc{

    {
        System.out.println("child C");
    }

    void pa(){
        int a=10;int b=20;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {

        childb b=new childb();
        b.ma();

//        practice

//        practice.ro();




//        child a

//        childa a = new childa();
//        a.roh();



//        child b



//        child c
//        childc c= new childc();
//        c.pa();



    }
}







