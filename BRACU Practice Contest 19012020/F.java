// Working program with FastReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class Main 
{ 
  static class FastReader 
  { 
    BufferedReader br; 
    StringTokenizer st; 
    
    public FastReader() 
    { 
      br = new BufferedReader(new
                                InputStreamReader(System.in)); 
    } 
    
    String next() 
    { 
      while (st == null || !st.hasMoreElements()) 
      { 
        try
        { 
          st = new StringTokenizer(br.readLine()); 
        } 
        catch (IOException e) 
        { 
          e.printStackTrace(); 
        } 
      } 
      return st.nextToken(); 
    } 
    
    int nextInt() 
    { 
      return Integer.parseInt(next()); 
    } 
    
    
  } 
  
  
  public static void main(String[] args) 
  { 
    FastReader s=new FastReader(); 
    int n = s.nextInt(); 
    int a=1;
    while(a<=n){
      int x1= s.nextInt(); 
      int y1 = s.nextInt(); 
      int x2 = s.nextInt(); 
      int y2 = s.nextInt(); 
      int c = s.nextInt(); 
      int b=1; 
      System.out.println("Case "+a+":"); 
      while (b<=c) 
      { 
        int x = s.nextInt(); 
        int y = s.nextInt(); 
        if ((x>=x1)&&(x<=x2)&&(y>=y1)&&(y<=y2)) 
          System.out.println("Yes"); 
        else
          System.out.println("No"); 
        b++;
      } 
      a++;
    }
  } 
} 