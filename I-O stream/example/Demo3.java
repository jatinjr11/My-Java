import java.io.FileOutputStream;  

class Demo3 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("txt1.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    

      }    
}  