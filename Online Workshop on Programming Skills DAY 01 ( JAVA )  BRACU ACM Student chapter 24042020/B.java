import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int []a=new int[3];
      a[0]=sc.nextInt();
      a[1]=sc.nextInt();
      a[2]=sc.nextInt();
      Arrays.sort(a);
      System.out.println(a[1]);
    }
  }
}
 