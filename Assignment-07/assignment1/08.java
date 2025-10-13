/*  Mobile Phone Store
Create a class Mobile with fields: brand, model, price.
Use setters to set values. Create a method to check if phone is affordable (price < 20000).
 */

import java.util.Scanner;
class Mobile{
private String brand;
private String model;
private int price;

public void setBrand(String brand){
   this.brand=brand;
}
public void setModel(String model){
   this.model=model;
}

public void setPrice(int price){
   this.price=price;
}
public boolean isAffordable(int price){
    if(price < 20000)
       return true;
return false;
      
}
 
}

class PhoneStore{
public static void main(String []args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter moblie phone's brand : ");
String brand=sc.nextLine();
//sc.nextLine();
System.out.println("Enter moblie phone's model : ");
String model=sc.nextLine();
System.out.println("Enter moblie phone's price : ");
int price=sc.nextInt();

Mobile m1=new Mobile();

m1.setBrand(brand);
m1.setModel(model);
m1.setPrice(price);
boolean status =m1.isAffordable(price);
if(status)
System.out.println("yes it's affordable you can buy it");
else
System.out.println("Price is to high it's unaffordable ");





}
}