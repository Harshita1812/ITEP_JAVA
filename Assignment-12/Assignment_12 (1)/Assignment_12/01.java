interface Chargeable{
    void chargeBattery();
}

abstract class Vehicle{
     String registration_num;

    Vehicle(String registration_num){
        this.registration_num = registration_num;
    }
    abstract void start();
    abstract void stop();

    void displayInfo(){
        start();
        stop();
    }
}

class Car extends Vehicle{

    Car(String registration_num){
        super(registration_num);
    }
    void start(){
        System.out.println("Car " + this.registration_num + " starting with petrol engine...");
    }

    void stop(){
        System.out.println("Car " + this.registration_num + " stopped");
    }
}

class Truck extends Vehicle{
    Truck(String registration_num){
        super(registration_num);
    }
    void start(){
        System.out.println("Truck " + this.registration_num + " starting with diesel engine...");
    }

    void stop(){
        System.out.println("Truck " + this.registration_num + " stopped");
    }
}

class ElectricBike extends Vehicle implements Chargeable{
     ElectricBike(String registration_num){
        super(registration_num);
    }
    void start(){
        System.out.println("Electric Bike " + this.registration_num + " starting starting silently...");
    }

    void stop(){
        System.out.println("Electric Bike " + this.registration_num + " stopped");
    }

   public void chargeBattery(){
        System.out.println("Electric Bike " + this.registration_num + " battery charging...");
    }
}

class ElectricCar extends Vehicle {
      ElectricCar(String registration_num){
        super(registration_num);
      }

      void start(){
        System.out.println("Electric Car " + this.registration_num + " starting silently...");
      }

      void stop(){
        System.out.println("Electric Car " + this.registration_num + " stopped");
      }

       public void chargeBattery(){
        System.out.println("Electric Car " + this.registration_num + " battery charging...");
    }

}

class TransportSystem{
    public static void main(String args[]){
        Vehicle car = new Car("KA01AB1234");
        Vehicle truck = new Truck("KA01AB1234");

        ElectricBike electricbike = new ElectricBike("KA03EL5678");
        ElectricCar electriccar = new ElectricCar("KA04EV4321");

        car.displayInfo();

        truck.displayInfo();

        electricbike.start();
        electricbike.chargeBattery();
        electricbike.stop();

        electriccar.start();
        electricbike.chargeBattery();
        electriccar.stop();
    }
}