import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0) {
            System.out.print("The number ");
            System.out.print(a + " is neutral.");
        }else if(a%2==1){
            System.out.print("The number ");
            System.out.print(a + " is odd.");
        }else{
            System.out.print("The number ");
            System.out.print(a + " is even.");
        }
    }
}