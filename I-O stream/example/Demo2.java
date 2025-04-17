// File Input Stream
import java.io.FileInputStream;  
 class Demo2 {  
     public static void main(String args[]){    
          try{    
            FileInputStream in=new FileInputStream("txt1.txt");    
            int i=in.read();  
            System.out.print((char)i);    
  
            in.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  