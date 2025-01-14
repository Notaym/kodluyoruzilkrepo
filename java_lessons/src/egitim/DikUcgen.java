package src.egitim;

import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Değişkenleri yukarıda tanımlıyoruz
        double a, b, c, u, alan;

        // Dik kenarlar için kullanıcıdan giriş alıyoruz
        System.out.print("Birinci dik kenarın uzunluğunu giriniz: ");
        a = scanner.nextDouble();

        System.out.print("İkinci dik kenarın uzunluğunu giriniz: ");
        b = scanner.nextDouble();

        // Hipotenüsü hesaplama (Pisagor Teoremi)
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + c);

        // Üçgenin üçüncü kenarını kullanıcıdan alıyoruz
        System.out.print("Üçüncü kenarın uzunluğunu giriniz: ");
        double c2 = scanner.nextDouble();

        // Üçgenin çevresini ve alanını hesaplama
        u = (a + b + c2) / 2; // Yarı çevre
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c2)); // Alan formülü

        System.out.println("Üçgenin çevresi: " + (2 * u));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
