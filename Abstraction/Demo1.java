
abstract class Vehicle{
    abstract void accelerate();
    abstract void brakes();
}

class Car extends Vehicle{
     void accelerate(){}
     void brakes(){}
}

class Demo1{
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle();    
    }
}