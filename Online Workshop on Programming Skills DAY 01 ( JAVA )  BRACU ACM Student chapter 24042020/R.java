import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    boolean flag=true;
    String r="";
    while(flag){
      String []c=s.split("");
      r="";
      int i=0;
      while(i<=c.length-1){
        if(i!=c.length-1){
          if((c[i]).equals(c[i+1]))
            i+=2;
          else {
            r+=c[i];
            i++;
          }
        }else{
          r+=c[i];
          i++;
        }
      }
      boolean check=false;
      char []ar =r.toCharArray();
      for (int k = 0; k < ar.length-1; k++) {
        if (ar[k]==ar[k+1]){ 
          check=true;
          s=r;
          break;
        }
      }
      if(check==false)
        flag=false;
    }
    if(r.equals(""))
      System.out.println("Empty String");
    else
      System.out.println(r);
    
  }
}
