import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int sum=0;
    if(k<=1){
      while(k<=1){
        sum+=k;
        k++;
      }
    }else if(k>1){
      while(k>=1){
        sum+=k;
        k--;
      }
    }
    System.out.println(sum);
    sc.close();
  }
}