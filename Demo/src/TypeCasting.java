import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Typecasting
        int num = (int)(4555.45f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a;// can't store more than 256
        System.out.println(b); // will give 257% 256
    }
}
