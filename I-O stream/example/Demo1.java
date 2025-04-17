import java.io.File;
import java.io.FileNotFoundException;
// import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Demo1 {
    public static void main(String args[]) {
        // File f = new File("txt2.txt");
/*

 try {
    File f = new File("txt1.txt");
    if (f.createNewFile()) {
        System.out.println("File created: " + f.getName());
    } else {
        System.out.println("File already exists.");
    }
} catch (Exception e) {
    System.out.println("An error occurred.");
    e.getMessage();
    // e.printStackTrace();
}


// Wriiting on file
try {
    FileWriter fw = new FileWriter("txt1.txt");
    fw.write("Indore is a Beauteous City\nRam ram");
    fw.close();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
*/

    // Reading a file 
    File f = new File("txt1.txt");
    try {
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
			System.out.println("Hello World");
        }
        sc.close();
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }
}