package Homework;

import java.util.Scanner;

public class PrintTable {
    public static void main(String [] args){
        int result=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("which table you want to print -");
        int num=sc.nextInt();

        for (int i=1;i<=10;i++){
           result=num*i;
            System.out.println(num +"*"+i+"="+result);
        }
        sc.close();

    }
}
