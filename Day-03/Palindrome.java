import java.util.Scanner;
class Palindrome{
public static void main(String[]args){
Scanner scn = new Scanner(System.in);
System.out.print("enter a number: ");
int num = scn.nextInt();
int original =num;
int reverse =0;
while(num>0){
int digit = num%10;
reverse = reverse*10+digit;
num=num/10;
}
if(original==reverse){
System.out.print("it is palindrome number");
}else{
System.out.print("not a palindrome number");
}}}