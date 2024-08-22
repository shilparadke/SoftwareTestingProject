package Homework;
import java.util.Scanner;

public class CountVowelConsonent {
    public static void main(String[] args) {
        int vCount=0,cCount=0;
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string -");
        String inputString = sc.nextLine();
       // inputString =inputString.toLowerCase();

        for(int i = 0; i < inputString.length(); i++) {
            //Checks whether a character is a vowel
            if(inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
            //Checks whether a character is a consonant
            else if(inputString.charAt(i) >= 'a' && inputString.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }

        }
        System.out.println("Vowel count "+vCount);
        System.out.println("Consonant count "+cCount);


}
}





