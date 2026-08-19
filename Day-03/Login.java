import java.util.Scanner;
class Login {
public static void main(String[]args){
int rpin =0000;
int upin =1767;
Scanner scn = new Scanner(System.in);
while(rpin !=upin){
System.out.print("enter the correct pin: ");
upin = scn.nextInt();
}
System.out.print("welcome");
}}

