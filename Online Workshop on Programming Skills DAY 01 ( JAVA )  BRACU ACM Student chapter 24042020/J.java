import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int n=sc.nextInt();
      double f = 1;
      for(int k=1;k<= n; k++){
        f*=k;
      }
      System.out.printf("%.0f", f);
      System.out.println();
          }
  }
}