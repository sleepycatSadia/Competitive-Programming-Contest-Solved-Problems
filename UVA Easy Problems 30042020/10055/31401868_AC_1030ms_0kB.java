import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long p=0;
    long s=0;
    while(sc.hasNextLong()){
      p=sc.nextLong();
      s=sc.nextLong();
      System.out.println(Math.abs(s-p));
    }
    sc.close();
  }
}