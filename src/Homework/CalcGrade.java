package Homework;

import java.util.Scanner;

public class CalcGrade {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks -");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade A");}

        else if (marks>=80 && marks<=89){
            System.out.println("Grade B");
        }
        else if(marks>70 && marks<=79){
            System.out.println("Grade C");
        }
        else if (marks>=60 && marks<=69){
            System.out.println("Grade D");
        }
        else
            System.out.println("Grade F");

        sc.close();


    }
}
