import java.util.Scanner;
public class Main{
public static void main (String[]args){
 Scanner sc=new Scanner (System.in);
 	int n=sc.nextInt();
 	for(int i=1;i<=n;i++){
         double l=sc.nextDouble();
         double pi=Math.acos(-1);
         double w=l*0.6;
         double r=l*0.2;
         System.out.printf("%.2f", pi*r*r);  
         System.out.print(" ");
         System.out.printf("%.2f", (l*w)-pi*r*r);  
         System.out.println();
}
}
}