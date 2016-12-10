import java.net.*;
import java.io.*;
public class clientsocket {

  public static void main(String[] args) {
    try
    {

    Socket s=new Socket(InetAddress.getLocalHost(),7);
    System.out.println("Socket created\n");
    System.out.println("Local Address: "+s.getLocalAddress());
    System.out.println("Local Host :"+InetAddress.getLocalHost());
    System.out.println("Local port:"+s.getLocalPort());
    System.out.println("Inet Address :"+s.getLocalAddress());
    InputStream in=s.getInputStream();
    System.out.println("Stream created");
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String x=null;
    while((x=br.readLine()!=null))
    System.out.println(x);
    in.close();
    s.close();
  }
    catch(Exception e)
    {System.out.println(e);}
  }

}
