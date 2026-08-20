import java.util.Scanner;
class Banking{
public static void main(String[]args){
Scanner scn = new Scanner(System.in);
System.out.print("enter your name :");
String name = scn.nextLine();
int Balance = 5000;
System.out.println("Available balance:" + Balance);
System.out.print("enter the amount");
Double amt = scn.nextDouble();
}}