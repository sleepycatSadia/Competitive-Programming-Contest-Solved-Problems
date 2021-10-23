import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int s = sc.nextInt();
        int x, y, p, q;

        for (int i = 0; i < l; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

        }

        for (int i = 0; i < s; i++) {
            p = sc.nextInt();
            q = sc.nextInt();


        }
        int m;
        int count=0;
        while (sc.hasNext()) {
            count++;
            m = sc.nextInt();
        }
        if(count%2==0)
            System.out.println("Mukhter Hossain is the winner.");
        else
             System.out.println("Jaber Tuhin is the winner.");

    }
}