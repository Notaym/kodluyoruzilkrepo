package src.egitim;

import java.util.Scanner;

public class kitleİndeks {
    public static void main(String[] args) {

        double kilo , indeks ;
        double metre ;

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        System.out.print("Boyunuzu metre cinsinde giriniz: ");
        metre = scanner.nextDouble();

        indeks =  kilo / ( metre  * metre ) ;
        System.out.print("Vücut kitle indeksiniz: " + indeks);

        }

    }
}