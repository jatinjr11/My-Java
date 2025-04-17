import java.io.FileOutputStream;

class Demo4 {

    public static void main(String[] args) {
        try{
            FileOutputStream fw = new FileOutputStream("txt1.txt");
            String s = "Welcome to Indore";
            byte b[] = s.getBytes();
            fw.write(b);
            fw.close();
            System.out.println("Success");
        } catch(Exception e){
            System.out.println(e);
        }
    }    
}
