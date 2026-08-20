import java.util.Scanner;
class Car1{
String brand;
String model;
int speed;
int maxspeed = 50;
public static void start(){
System.out.print("car started");
}
public void accelerate(){
speed = speed +5;
System.out.println("accelerated , car travelling at " + speed +"  kms ");
}
public void brake(){
speed = speed - 5;
System.out.println("speed decreased , car travelling at " + speed +" kms");
}}

class Newcar{
public static void main(String[]args){
Car c1 = newCar();
c1.brand ="bmw";
System.out.print(c1.brand);
c1.start();
c1.accelerate();
c1.brake();

}}