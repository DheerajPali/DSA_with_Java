import java.util.Arrays;
public class SearchString{
    public static void main(String[]args){
        System.out.println("Search your target in String..");
        String str = "taAh1isisstring";
//        char target = 97; //it will automatically take char from unicode(ASCII) value..
        char target = 'm';

        System.out.println(Arrays.toString(str.toCharArray()));
//        int ans = linearSearch(str,target);
        boolean ans = linearSearch1(str,target);
        System.out.println(ans);

    }

    private static int linearSearch(String str, char target) {
        if(str.length() ==0){
            return -1;
        }
        for(int i = 0; i < str.length(); i++){
            char element = str.charAt(i);
            if(element == target){
                return i;
            }
        }
        return -1;
    }

    //using foreach loop
    private static boolean linearSearch1(String str, char target) {
        if(str.isEmpty()){
            return false;
        }
        for(char element : str.toCharArray())
        {
            if(element == target)
            {
                return true;
            }
        }
        return false;
    }
}