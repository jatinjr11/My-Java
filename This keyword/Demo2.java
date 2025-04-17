
class Test{
    int i;
    void setValues(int i){
        i = i;
    }
    void show(){
        System.out.println(i);
    }
}

class Demo2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.setValues(10);
        t.show();
    }
}