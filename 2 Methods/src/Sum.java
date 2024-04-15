import java.util.Scanner;

public class Sum {
    public static void main(String[]args){
//        int val =  sum1();
//        System.out.println("The sum = "+ val);
        int result = add(9,10);
        System.out.println(result);

    }
    /*
        access modifier return_type name(){
            //body
            return statement;
        }
     */
//    static int sum1(){    // static means not depends on inside's objects.
//        System.out.println("Enter your numbers");
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum  =  num1+num2;
//        return sum;
//        // after returning no more line will execute , same as break;
//    }


//    static void  sum(){
//        System.out.println("Enter 2 numbers");
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum  =  num1+num2;
//        System.out.println("The sum is "+ sum);
//    }

    //you can ask for arguments too .
    static int add(int a,int b){ //Here a and b are argumemts...
        return a+b;
    }

}
