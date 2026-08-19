import java.util.Scanner;
class Restaurant {
public static void main(String[]args){
Scanner scn = new Scanner(System.in);
System.out.print("welcome to restaurant!\n enter the number(1 to 4)\n1:veg\n2:non-veg\n3:starters\n4:deserts");
int menu = scn.nextInt();
switch(menu){
case 1:
System.out.print("\n1:fried rice\n2:meals\n3:noodles");
break;
case 2:
System.out.print("\n1:chicken\n2:fish\n3:mutton");
break;
case 3:
System.out.print("\n1:gobi\n2:pepper panner\n3:pepper chicken");
break;
case 4:
System.out.print("\n1:ice creame\n2:jammun\n3:cake");
break;
default:
System.out.print("invalid");
}}}
