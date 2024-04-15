import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[]args){
        System.out.println("Enter a 3 digit number");
        Scanner in = new Scanner(System.in);
       /*
       int n = in.nextInt();
        var ans = isArmStrong(n);
        System.out.println(ans);
        */

        //check all armstrong number of 3 digits..
        for(int i = 100; i < 1000; i++){
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmStrong(int a){
        int original = a;
        int sum = 0;
        while(a>0){
            int rem = a % 10;
            sum = sum + rem*rem*rem;
            a /= 10;
        }
        return original == sum;
    }
}
