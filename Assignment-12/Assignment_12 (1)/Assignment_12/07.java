interface Flyable{
    void fly();
}

abstract class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void eat();
    abstract void makeSound();

    void showInfo(){
        System.out.println("\n" + this.name + " is " + this.age + " years old");
    }
}

class Lion extends Animal{
    public Lion(String name, int age){
        super(name, age);
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void makeSound(){
        System.out.println(this.name + " is making sound");
    }
}

class Elephant extends Animal{
    public Elephant(String name, int age){
        super(name, age);
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void makeSound(){
        System.out.println(this.name + " is making sound");
    }
}

class Parrot extends Animal implements Flyable{
    public Parrot(String name, int age){
        super(name, age);
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void makeSound(){
        System.out.println(this.name + " is making sound");
    }
    public void fly(){
        System.out.println(this.name + " is flying");
    }
}

class ZooAnimalManagement{
    public static void main(String args[]){
        Animal lion = new Lion("Lion", 55);
        Animal elephant = new Elephant("Elephant", 43);
        Animal parrot = new Parrot("Parrot" , 22);

        lion.showInfo();
        lion.eat();
        lion.makeSound();
       
        elephant.showInfo();
        elephant.eat();
        elephant.makeSound();
       
        parrot.showInfo();
        parrot.eat();
        parrot.makeSound();

        if(lion instanceof Flyable){
           ((Flyable)lion).fly();
        }
        if(elephant instanceof Flyable){
           ((Flyable)elephant).fly();
        }
        if(parrot instanceof Flyable){
           ((Flyable)parrot).fly();
        }
        
    }
}