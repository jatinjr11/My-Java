// 2. this keyword can be used to invoke current class method(implicitly).
class Test {
    void display(){
        System.out.println("hello");
    }

    void show(){
        display();  // if you don't use the this keyword, compiler automatically adds this keyword while invoking the method
    }
    public static void main(String[] args) {
        
    }
}