import java.util.Arrays;
//Here you can pass any no. of Arguments, with the help of this concept.
public class VarArgs {
    public static void main(String[]args){
        System.out.println("Here you can pass any no. of Arguments..");
//        fun(3,4,5,3,2,3);
        multiple(3,4,"Dheeraj","pali");
    }
    static void multiple(int a, int b,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...s){
        System.out.println(Arrays.toString(s));
    }

}
