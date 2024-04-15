public class OverLoading {
    //At compile time , it decides which function will run.
    //The same concept called polymorphism , means you can define 2 or more methods using same name
    // Either the no. of arguments or type should be different.

    public static void main(String[] args) {
        fun(54);
        fun("Dheeraj");
    }

    public static void fun(int a) {
        System.out.println(a);
        System.out.println("Fisrt One");
    }

    public static void fun(String b){
        System.out.println(b);
        System.out.println("Second One");
    }

}
