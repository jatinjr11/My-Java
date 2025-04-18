
class Test{
    int i;
    void setValues(int x){
        i = x;
    }
    void show(){
        System.out.println(i);
    }
}

class Demo1 {
    public static void main(String[] args) {
        Demo2 t = new Demo2();
        t.setValues(10);
        t.show();
    }
}