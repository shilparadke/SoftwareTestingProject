package Homework;
import java.util.Scanner;
public class FizzBuzz{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number :");
    int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else
            System.out.println("Buzz");
    }
}
