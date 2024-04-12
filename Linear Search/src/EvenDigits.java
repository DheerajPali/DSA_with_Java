public class EvenDigits {
    public static void main(String[]args){
        int [] nums = {-10,92,93,34,29,10};
//        int number  = evenDigits(nums);
//        System.out.println(number);
        int abc = findNumbers(nums);
//        System.out.println(abc);
//        System.out.println(digits(123456)); //shows number of digits
        System.out.println(digits2(-4544));
        System.out.println(Integer.MIN_VALUE);
    }

    static int digits2(int num)
    {
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num)+1); // Math.log10(NUMBER) will tell you no. of digits in NUMBER;
    }

    static int findNumbers(int[]array){
        int count = 0;
        for(int i : array)
            if(even(i))
                count++;
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits %2 ==0;
    }

     static int digits(int num) {
        if(num == 0){
            return 1;
        }
        if(num < 0){
            num *= -1;
        }
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }






//    static int evenDigits(int []array)
//    {
//        int num = 0;
//        for(int i = 0; i < array.length; i ++){
//            int count = 0;
//            while(array[i] > 0){
//                count ++;
//                array[i]/=10;
//            }
//            if(count %2 ==0){
//                num ++;
//            }
//        }
//        return num;
//    }
}
