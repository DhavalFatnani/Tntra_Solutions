/*
Problem 5: Swap two numbers without using a temporary variable
Input:integer a = "10", b = "50".
Output: Strings after swap: a = 50 and b = 10
 */

 import java.util.*;

public class _5_swap_numbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int Number_1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int Number_2 = sc.nextInt();

        sc.close();

        NumberSwapper swapper = new NumberSwapper(Number_1, Number_2);

        System.out.println("Numbers Before Swapping:");
        System.out.println("Number 1: "+swapper.getNumber1());
        System.out.println("Number 2: "+swapper.getNumber2());

        swapper.Swap();

        System.out.println("Numbers After Swapping:");
        System.out.println("Number 1: "+swapper.getNumber1());
        System.out.println("Number 2: "+swapper.getNumber2());
    }
}

class NumberSwapper{
    private int number1;
    private int number2;

    public NumberSwapper(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void Swap(){
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
    }

    public int getNumber1(){
        return number1;
    }

    public int getNumber2(){
        return number2;
    }
}