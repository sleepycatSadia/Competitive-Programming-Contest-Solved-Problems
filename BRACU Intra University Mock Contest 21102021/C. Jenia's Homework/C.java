import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 1; i <=a ; i++) {
            int s=sc.nextInt();
            double x=Math.sqrt(s);
            System.out.print(s-(3.14159265358979323846 *(x/2)*(x/2))+" ");
            System.out.println(2*3.14159265358979323846 *(x/2));
        }
        
    }
}