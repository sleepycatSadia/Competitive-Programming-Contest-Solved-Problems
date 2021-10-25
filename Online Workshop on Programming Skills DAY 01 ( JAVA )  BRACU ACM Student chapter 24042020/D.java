import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int []a=new int[t];
    for(int x=0;x<t;x++){
      a[x]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int y=0;y<t;y++){
      System.out.println(a[y]);
    }
 
  }
}
 