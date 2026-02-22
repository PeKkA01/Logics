import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int original_num = sc.nextInt();
        int result = 0;
        while(original_num != 0){
            int rem = original_num%10;
            result = result*10+rem;
            original_num = original_num/10;

        }
        System.out.println(result);



    }
}
