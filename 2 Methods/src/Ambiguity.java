import java.util.Arrays;
public class Ambiguity {
    public static void main(String[]args){
        System.out.println("Ambiguity example,compile is confused..");
//        ambiguity("Dheeraj"); //Dheeraj
//        ambiguity(4); //4


//         ambiguity(); //will not run...
        //compiler is asking - konsa ambiguity???

    }

    static void ambiguity(int a){
        System.out.println(a);
    }

    static void ambiguity(String a){
        System.out.println(a);
    }
}
