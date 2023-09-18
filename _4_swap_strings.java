/*
Problem 4:  Swap two Strings Without Using any Third Variable
Input: a = "Hello", b = "World".
Output: Strings after swap: a = World and b = Hello
*/

import java.util.*;

public class _4_swap_strings{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String a: ");
        String a = sc.next();
        System.out.print("Enter String b: ");
        String b = sc.next();

        System.out.println("Words Before Swapping:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a = a + b;

        b = a.substring(0, a.length()-b.length());

        a = a.substring(b.length());

        System.out.println("Words After Swapping:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        sc.close();
    }
}