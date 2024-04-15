import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String [] args){
        System.out.println("ArrayList Examples...Here you can add unlimited items..");
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(4);

        list.add(45);
//        list.add(55);
//        list.add(18);
//        list.add(45);
//        list.add(55);
//        list.add(18);

        //How to print the list
        System.out.println(list);


//check , wether our no. is present or not?
        System.out.println(list.contains(18));

// you can edit any index of list
        list.set(0,99);
        System.out.println(list);

// how to remove an index from list
        list.remove(0);
        System.out.println(list);


        // how to take input in list
        System.out.println("Enter values to add in the list");
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        // print the list

        for(int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " "); // pass index inside get method. list[index] won't work here.

        }

        System.out.println("\n In the form of list "+list);

    }
}