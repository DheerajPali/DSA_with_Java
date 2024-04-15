package Code;
public class Conditionals {
    public static void main(String[] args){
        System.out.println("We're ready to code..");

        /*
        Syntas of if statements:
        if (boolean expression T or F){
        //body(do this)
        }
        else{
        //do this
        }
         */

        int salary = 2000;
        if(salary>100){
            salary += 1000;
        }
        else{
            salary -= 10;
        }
        System.out.println(salary);



        //multiple if-else statements
        int value = 10000;
        if(value>10000){
            value += 9;
        }
        else if(value>10){
            value-= 10;
        }
        else{
            value += 100000000;
        }

        System.out.println(value);
    }
}
