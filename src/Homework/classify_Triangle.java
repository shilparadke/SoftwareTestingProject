package Homework;
import java.util.Scanner;
public class classify_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle");
        int side1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter second side of triangle");
        int side2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter third side of triangle");
        int side3 = sc2.nextInt();

        if (side1== side2 && side1== side3) {

          System.out.println("This triangle is equilateral");
        }
        else if(side1!= side2 && side1!= side3 && side2!=side3){
            System.out.println("This triangle is scalene ");
        }
        else {
            System.out.println("This triangle is isosceles  ");
        }
        sc.close();
        sc1.close();
        sc2.close();

    }
}
