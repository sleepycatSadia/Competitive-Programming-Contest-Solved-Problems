import java.util.Scanner;
class Main{
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int count=1;
    while(count <= t) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int sum=a+b;
      System.out.println("Case " + count + ": " + sum);
      count++;                    
    }  
  }
}