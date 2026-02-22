/*
import java.util.*;
public class PerfectNumber {
   public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int result = 0;
        int num = sc.nextInt();
        for (int i = 1; i <= num  ; i++) {
            result = a + b;
            a = b;
            b = result;

            System.out.println(result);
        }
    }
}
 */


/*
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n +" is a perfect number ");
        }
        else{
            System.out.println(n +" is not a perfect number");
        }
    }
}

*/

import java.util.*;
public class PerfectNumber{
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
        System.out.println("perfect numbers from 1 to 100");
        for (int j = 1; j <= 100 ; j++) {
            int sum = 0;
            for (int i = 1; i < j ; i++) {
                if(j % i == 0){
                    sum+= i;
                }

            }
            if(sum == j){
                System.out.println(j);
            }
        }


    }
}


