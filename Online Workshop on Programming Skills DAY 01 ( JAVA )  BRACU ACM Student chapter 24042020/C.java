import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(a%b);
    }
  }
}