import java.util.Scanner;
class calculater{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
int num = scn.nextInt();
if(num>0)
System.out.println("positive");
else if(num<0) 
System.out.println("negative");
else
System.out.println("netrual");
}
}
