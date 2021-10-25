import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException;
public class Main 
{ 
  static class Reader 
  { 
    final private int BUFFER_SIZE = 1 << 16; 
    private DataInputStream din; 
    private byte[] buffer; 
    private int bufferPointer, bytesRead; 
    
    public Reader() 
    { 
      din = new DataInputStream(System.in); 
      buffer = new byte[BUFFER_SIZE]; 
      bufferPointer = bytesRead = 0; 
    } 
    
    public Reader(String file_name) throws IOException 
    { 
      din = new DataInputStream(new FileInputStream(file_name)); 
      buffer = new byte[BUFFER_SIZE]; 
      bufferPointer = bytesRead = 0; 
    } 
    
    public String readLine() throws IOException 
    { 
      byte[] buf = new byte[64]; // line length 
      int cnt = 0, c; 
      while ((c = read()) != -1) 
      { 
        if (c == '\n') 
          break; 
        buf[cnt++] = (byte) c; 
      } 
      return new String(buf, 0, cnt); 
    } 
    
    public int nextInt() throws IOException 
    { 
      int ret = 0; 
      byte c = read(); 
      while (c <= ' ') 
        c = read(); 
      boolean neg = (c == '-'); 
      if (neg) 
        c = read(); 
      do
      { 
        ret = ret * 10 + c - '0'; 
      } while ((c = read()) >= '0' && c <= '9'); 
      
      if (neg) 
        return -ret; 
      return ret; 
    } 
    
    
    private void fillBuffer() throws IOException 
    { 
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
      if (bytesRead == -1) 
        buffer[0] = -1; 
    } 
    
    private byte read() throws IOException 
    { 
      if (bufferPointer == bytesRead) 
        fillBuffer(); 
      return buffer[bufferPointer++]; 
    } 
    
    public void close() throws IOException 
    { 
      if (din == null) 
        return; 
      din.close(); 
    } 
  } 
  
  
  
  public static void main(String[] args) throws IOException 
  { 
    Reader s=new Reader(); 
    int n = s.nextInt(); 
    int a=1;
    while(a<=n){
      String p= s.readLine(); 
      String b= s.readLine(); 
      String []ar=b.split("\\.");
      int d1=Integer.parseInt(ar[0],2);
      int d2=Integer.parseInt(ar[1],2);
      int d3=Integer.parseInt(ar[2],2);
      int d4=Integer.parseInt(ar[3],2);
      b=""+d1+"."+d2+"."+d3+"."+d4;
      if(p.equals(b))
        System.out.println("Case "+a+": Yes");
      else
        System.out.println("Case "+a+": No");
      a++;
    }  
  }
} 