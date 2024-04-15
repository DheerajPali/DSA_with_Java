
public class Swap{
    public static void main(String[]args){
        System.out.println("Hello , welcome to swap");

        int a = 10 ;
        int b = 20;
       swap1(4,6);
        System.out.println(a +" "+ b); //Will not change the value


    }
//    static void swap(int a, int b){
//        System.out.println("before swap : a = "+a + " ,b= "+b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("after swap : a = "+a + " ,b= "+b);
//    }

    static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}