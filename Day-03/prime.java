import java.util.Scanner;
class prime{
public static void main(String[]args){
Scanner scn = new Scanner(System.in);

System.out.print("enter a number");

int n = scn.nextInt();
int count =0;

for(int i=1;i<=n;i++){
if (n%i==0){count = count +1;}
if(count ==0)
System.out.print("prime");
else
System.out.print("not a prime number");
}}}




