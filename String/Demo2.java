class Test {
    public static void main(String agrs[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        System.out.println(s1 == s2); // true, because both refer to the same string literal in the string pool
        System.out.println(s1 == s3); // false, because s3 is a new object in heap memory
        System.out.println(s3 == s4); // false, because both are different objects in heap memory
    }     
}