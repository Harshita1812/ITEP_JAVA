interface Chargeable{
    public void chargeBattery();
}
abstract class Vehicle{
    private String reg_no;
    Vehicle(){}
    public Vehicle(String reg_no){
        this.reg_no = reg_no;
    }
    
    abstract public void toStart();
    abstract public void toStop();
    public void DisplayInfo(){
        System.out.println("Details here! ");
    }
}
class Car extends Vehicle{
    Car(){}
    public Car(String r){
         super(r);
    }

    public void toStart(){
        System.out.println("Car starting with petrol engine: ");
    }
    public void fuel(){
        System.out.println("fuel is in car: ");
    }
    public void toStop(){
        System.out.println("Car is Stop: ");
    }
}
class Truck extends Vehicle{
    Truck(){}
    public Truck(String r){
         super(r);
       
    }
    public void toStart(){
        System.out.println("Truck start with Diesel engine: ");
    }
    public void fuel(){
        System.out.println("Fuel is in truck: ");
    }
    public void toStop(){
        System.out.println("Truck is Stop: ");
    }
}
class ElectricBike extends Vehicle implements Chargeable{
    ElectricBike(){}
    public ElectricBike(String r){
         super(r);
       
    }
    public void toStart(){
        System.out.println("Electric Bike Starting silently: ");
    }
    public void toStop(){
        System.out.println("Electric Bike Stopped: ");
    }
    public void chargeBattery(){
        System.out.println("Bike is charge: ");
    }
    
}
class ElectricCar extends Vehicle implements Chargeable{
    ElectricCar(){}
    ElectricCar(String r){
        super(r);
       
    }
    public void toStart(){
        System.out.println("Electric Car Starting silently: ");
    }
    public void toStop(){
        System.out.println("Electric Car Stopped: ");
    }
    public void chargeBattery(){
        System.out.println("Car is charge: ");
    }
}

class TransportationSystem{
    public static void main(String args[]){
        Car c = new Car("KA01AB1234");
        c.toStart();
        c.fuel();
        c.toStop();

        Truck t = new Truck("KA02XY9876");
        t.toStart();
        t.fuel();
        t.toStop();

        ElectricBike eb = new ElectricBike("KA04EV4321");
        eb.toStart();
        eb.toStop();
        eb.chargeBattery();

        ElectricCar ec = new ElectricCar();
        ec.toStart();
        ec.toStop();
        ec.chargeBattery();



    }

    
    
}