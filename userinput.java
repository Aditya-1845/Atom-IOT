import java.util.Scanner;
class userinput{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("enter your name");
String name = scn.nextLine();
System.out.println("enter your age");
int age = scn.nextInt();
System.out.println("enter your gpa");
float gpa = scn.nextFloat();
System.out.println("enter your aadhar number");
long aadhar =scn.nextLong();
scn.nextLine();
System.out.println("enter your DOB");
String DOB = scn.next();
System.out.print("my name is "+name+" and age is " +age+" and my gpa is "+gpa+" and my aadhar number is "+aadhar+" and my DOB is "+DOB+"");
}}
