import java.util.Scanner;
class Car{
String brand;
String model;
int speed;
int maxspeed = 50
public static void start(){
System.out.print("car started");
}
public void accelerate(){
speed = speed +5
System.out.println("accelerated , car travelling at " + speed + kms ");
}
public void break(){
speed = speed - 5;
System.out.println("speed decreased . car travelling at " + kms ");
}}

class CarDemo{
public static void main(String[]args){
Car c1 = new car();
c1.brand ="bmw";
System.out.print(c1.brand);
}}