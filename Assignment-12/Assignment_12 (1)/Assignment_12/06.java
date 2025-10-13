interface SmartDevice{
    void connectWifi();
}

abstract class Appliance{
    String name;
    String power;

    public Appliance(String name, String power){
        this.name = name;
        this.power = power;
    }

    abstract void turnOn();
    abstract void turnOff();

    public void showStatus(){
        System.out.println("\n" + this.name + " has this much amount of power : " + this.power);
    }
}

class Fan extends Appliance{

    public Fan(String name, String power){
        super(name, power);
    }
    void turnOn(){
        System.out.println(this.name + " is turned on");
    }
    void turnOff(){
        System.out.println(this.name + " is turned off");
    }
}

class Light extends Appliance implements SmartDevice{

    public Light(String name, String power){
        super(name, power);
    }
    void turnOn(){
        System.out.println(this.name + " is turned on");
    }
    void turnOff(){
        System.out.println(this.name + " is turned off");
    }
    public void connectWifi(){
        System.out.println(this.name + " is connected to wifi");
    }
}

class WashingMachine extends Appliance implements SmartDevice{

    public WashingMachine(String name, String power){
        super(name, power);
    }
    void turnOn(){
        System.out.println(this.name + " is turned on");
    }
    void turnOff(){
        System.out.println(this.name + " is turned off");
    }
    public void connectWifi(){
        System.out.println(this.name + " is connected to wifi");
    }
}

class SmartHomeSystem{
    public static void main(String args[]){
        
        Appliance fan = new Fan("Fan", "20Watt");
        Appliance light = new Light("Light", "10Watt");
        Appliance washingMachine = new WashingMachine("Washing-Machine", "50Watt");

        fan.showStatus();
        fan.turnOn();
        fan.turnOff();

        light.showStatus();
        light.turnOn();
        light.turnOff();

        washingMachine.showStatus();
        washingMachine.turnOn();
        washingMachine.turnOff();
        System.out.println();
        if(fan instanceof SmartDevice){
            ((SmartDevice)fan).connectWifi();
        }
        if(light instanceof SmartDevice){
            ((SmartDevice)light).connectWifi();
        }
        if(washingMachine instanceof SmartDevice){
            ((SmartDevice)washingMachine).connectWifi();
        }
 
    }
}