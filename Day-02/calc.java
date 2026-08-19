import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if (num > 500 && num <= 1000)
            System.out.print("Greater than 500");
        else if (num > 100)
            System.out.print("Greater than 100");
        else if (num > 50)
            System.out.print("Greater than 50");
        else
            System.out.print("50 or less");

        scn.close();
    }
}