import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionArrayList{
    public static void main(String [] args){
        System.out.println("This is multi dimensional ArrayList..");
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for(int i = 0 ; i < 3 ; i ++){
            //here we're initializing no. of arraylist inside arraylist.
                list.add(new ArrayList<>());
        }
        System.out.println(list); // will give you structure(blank) of MultiD Arraylist

        // add elements
        for(int i = 0; i < 3; i++){
            System.out.println("Enter elements to add in the ArraList no. "+ i);
            for(int j = 0; j < 3; j++){
                //first we are fatching perticular index from ArrayList(MultiDimensional)
                //the we are adding value for that indes
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}