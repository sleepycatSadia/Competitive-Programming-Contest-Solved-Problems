import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int k=1;
    while(k<=s){
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>20||b>20||c>20)
        System.out.println("Case "+k+": bad");
      else
        System.out.println("Case "+k+": good");
      k++;
    }
  }
}