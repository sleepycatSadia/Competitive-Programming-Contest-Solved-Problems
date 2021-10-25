import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int n=sc.nextInt();
      int c=0;
      while(true){
        if(n!=0){
          if(n%10==4){
            c++;
          }  
          n=n/10;
 
        }else
          break;
      }
      System.out.println(c);
    }
  }
}