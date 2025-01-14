package src.egitim;

import java.util.Scanner;

public class daireAlani {
    public static void main(String[] args){

        int r;
        double pi = 3.14;

        try (Scanner inp = new Scanner(System.in)) {

        System.out.print("Dairenin yarı çapını giriniz: ");

        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("dairenin alanı: " + alan);
        System.out.println("dairenin çevresi:" + cevre);

        }
    }

}