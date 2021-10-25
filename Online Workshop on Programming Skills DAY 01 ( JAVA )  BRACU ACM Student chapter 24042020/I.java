import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n=sc.nextLine();
    System.out.println(n.substring(0,1)+" "+ n.substring(n.length()-1));
  }
}
