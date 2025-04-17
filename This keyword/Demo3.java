
class Test{
    int i;
    void setValues(int i){
        this.i = i;
    }
    void show(){
        System.out.println(i);
    }
}
// akela this object ko refer krta h
class Demo2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.setValues(10);
        t.show();
    }
}
// this keyword can be used to refer current class instance variable