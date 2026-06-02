class Car {
    String brand;
    void start(){
        System.out.println("Car is started");
    }
}

public class main{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyoto";
        System.out.println("Car brand : " + c1.brand);
        c1.start();
    }
}
