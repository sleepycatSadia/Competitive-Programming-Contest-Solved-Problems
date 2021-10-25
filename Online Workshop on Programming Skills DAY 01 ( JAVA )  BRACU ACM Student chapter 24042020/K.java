import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      double r=sc.nextDouble();
      double c=r*r*(4-3.14159265358979323);
      c+=Math.pow(10,-9);
      System.out.print("Case "+x+": ");
      System.out.printf("%.2f", c);
      System.out.println();
    }
  }
}