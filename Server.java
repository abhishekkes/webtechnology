import java.net.*;
import java.io.*;
class Server
{
  public static void main(String []args)
  { 
      ServerSocket s;
     PrintWriter out;
     BufferedReader brc;
    Socket c;
    String msg;
    int a,b;
    try
    {
        s=new ServerSocket(2000);
        c=s.accept();//Server Accepts the client request





        System.out.println("Connection Received");
        brc=new BufferedReader(new InputStreamReader(c.getInputStream()));
        out=new PrintWriter(c.getOutputStream(),true);

        System.out.println("Stream Fetched for R/W");
        msg=brc.readLine();//it used to read Data from Client

        System.out.println("Client Info Received");
       
        a=Integer.parseInt(msg);
       b=a*a*a;
       msg=String.valueOf(b);
       out.println(msg);//Return result to the client
       System.out.println("Cube of "+a +" has been sent to client");       
       s.close();
    }catch(Exception e){}
  }
}