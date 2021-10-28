import java.util.*;
class Main{
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int count=1;
    while(count <= t) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if(a<b)
        System.out.println("<");
      else if(a>b)
        System.out.println(">");
      else
        System.out.println("=");
      count++; 
    }  
  }
}