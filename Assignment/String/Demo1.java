package Assignment.String;
// Write a program to reverse a given String without using the built-in reverse() method.

public class Demo1 {
    public static void main(String[] args) {
        String input = "Hello World";
        String reverse = "";
        for(int i= input.length() - 1 ; i>=0; i--){
            reverse += input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverse);
    }

}
