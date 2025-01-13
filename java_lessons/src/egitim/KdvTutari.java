package src.egitim;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        double tutar ;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir tutar giriniz:");
        tutar = input.nextDouble();

        double kdvOrani = 0.18;
        double kdvTutar = tutar * kdvOrani;
        double fiyat = tutar + kdvTutar;

        System.out.println("Ürün Fiyatı: " + tutar);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Toplam Tutar: " + fiyat);
        input.close();








    }
}
