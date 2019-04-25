package Math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anangram {

    //CAT //ACT //ARMY //MARY

    public void anangram(String a, String b) {
        char[] arrayOfCharFromStringA = a.toCharArray();
        char[] arrayOfCharFromStringB = b.toCharArray();
        Arrays.sort(arrayOfCharFromStringA);
        Arrays.sort(arrayOfCharFromStringA);
        if(Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)) {
            System.out.println("words are anangram");
        }else
            System.out.println("words are not anangram");

    }

    public static void main(String[] args) {
        Anangram anangram = new Anangram();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first word : ");
        String firstWord = scanner.nextLine();
        System.out.println("Please enter second word : ");
        String secondWord = scanner.nextLine();
        anangram.anangram(firstWord, secondWord);

    }
}
