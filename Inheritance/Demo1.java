
class A{
    void show(){
        System.out.println(this);
        System.out.println("Ram");
    }
}

class Demo1 extends A{
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}