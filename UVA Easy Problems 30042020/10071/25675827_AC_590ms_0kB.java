import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      while (sc.hasNext()){
        long p= sc.nextLong();
        long t = sc.nextLong();
        long d = p * (2 * t);      
        System.out.println(d);
      }
 
    }
}