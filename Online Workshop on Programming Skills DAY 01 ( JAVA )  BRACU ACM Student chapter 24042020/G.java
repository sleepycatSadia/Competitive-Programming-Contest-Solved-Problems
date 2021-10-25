import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int n=sc.nextInt();
      for(int y=1;y<=n;y++){
        int p=sc.nextInt();
      }
      long r=0;
      for(int y=1;y<n;y++){
        r+=y;
      }
      System.out.println(r);
    }
  }
}