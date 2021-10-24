import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int k=1;
    while(k<=s){
      int p=sc.nextInt();
      int []a=new int[p];
      for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      System.out.println("Case "+k+": "+a[a.length-1]);
      k++;
    }
    sc.close();
  }
}


