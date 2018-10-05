package Altile.UserFiresphinX.Test.SoloLearnTest;

import java.util.Scanner;

public class Zahl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nenn mir eine Zahl.");

        int zahl = scan.nextInt();

        if (zahl > 50) {
            System.out.println("zu hoch! Maximal 50!");
        } else {
            if (zahl < 30) {
                System.out.println("die Zahl muss größer als 30 sein!");
            } else {
                while (zahl >= 30) {
                    if (zahl == 30) {
                        System.out.println("Yea " + zahl + " erreicht.");
                        break;
                    } else {
                        System.out.println("Die Zahl ist größer als 30 und ist: " + zahl--);
                    }
                }
            }


        }


    }

}
