package src.egitim;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20 , total , startPrice = 10;

        try (Scanner input = new Scanner(System.in)) {

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = (perKm * km + startPrice);
        total = ( total < 20 ) ? 20 : total;

        System.out.println("Toplam tutar: "+ total);
        }
    }
}