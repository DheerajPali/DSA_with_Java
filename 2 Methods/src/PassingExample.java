public class PassingExample {
    public static void main(String[]main){
//        int a = 10;
//        int b = 20;
//        swap(a,b);
//        System.out.println("a = "+a+"; b ="+b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name); //this name will not change inside fucntion
    }
//    public static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }
    public static void changeName(String naam){
        naam = "Dheeraj Pali";
    }
}
