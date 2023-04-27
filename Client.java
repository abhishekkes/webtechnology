import java.net.*;
import java.io.*;
class Client
{
   public static void main(String []args)
   {
       Socket c;
       BufferedReader brc,brs;
       PrintWriter out;
       String msg;
       try
       {
        c=new Socket("127.0.0.1",2000);
        System.out.println("Connection Established"); 
        
        

        out=new PrintWriter(c.getOutputStream(),true);
   brc=new BufferedReader(new InputStreamReader(c.getInputStream()));
        brs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Connection Stream fetched");
         System.out.print("Enter Any Number ");
         msg=brs.readLine();

         out.println(msg);
         
         msg=brc.readLine();
        System.out.println("Message Received :"+msg);
        c.close();
       }catch(Exception e){}
   }
}