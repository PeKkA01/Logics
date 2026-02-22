import java.util.*;
public class StopWatch {
    public static void main(String[] args) {
        System.out.println("Enter the start time");
        Scanner sc = new Scanner(System.in);
        double start = sc.nextDouble();
        System.out.println("Enter end time");
        double end = sc.nextDouble();
        double elapse  = end - start;
        System.out.println(elapse);
    }
}
