package Beach_80.src.day07_ifStatements;

import java.util.Scanner;

public class C05_ifElsetatements {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin ");

        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("Girilen karakter bir harftir.");
        } else {
            System.out.println("Girilen karakter bir harf değildir");
        }


        }

    }
