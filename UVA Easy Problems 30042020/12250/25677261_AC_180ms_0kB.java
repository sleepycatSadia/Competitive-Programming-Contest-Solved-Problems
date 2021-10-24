import java.util.*;
import java.util.HashMap;
public class Main{ 
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
    HashMap<String,String> h = new HashMap<String,String>();
    h.put("HOLA","SPANISH");
    h.put("HALLO","GERMAN");
    h.put("BONJOUR","FRENCH");
    h.put("CIAO","ITALIAN");
    h.put("ZDRAVSTVUJTE","RUSSIAN");
    h.put("HELLO","ENGLISH");
    int j=0;
    while(true){
      String n=sc.nextLine();
      String s="";
      if((n).equals("#"))
        break;
      else{ 
        j++;
        if(h.containsKey(n))
          System.out.println("Case "+j+": "+h.get(n));
        else
          System.out.println("Case "+j+": UNKNOWN");
      }
    }
  }
}
