package src.egitim;

import java.util.Scanner;

public class AverageScoreCalculator {
    public static void main(String[] args) {
        //DEĞİŞKENLERİ OLUŞTURUYORUZ
        int mat,fizik,kimya,turkce,muzik,tarih;

        //SCANNER SINIFIMIZI TANIMLIYORUZ
        Scanner inp = new Scanner (System.in);

        //KULLANICIDAN DEĞERLERİ ALICAZ
        System.out.print("Matematik notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuz:");
        muzik = inp.nextInt();

        System.out.print("Tarih notunuz:");
        tarih = inp.nextInt();

        int toplam = ( mat + fizik + kimya + turkce + muzik + tarih);
        double sonuc = toplam / 6.00;
        System.out.println("ortalamanız:" + sonuc);
        boolean durum = sonuc >= 60;
        System.out.println(durum ? "tebrikler geçtiniz":"malesef kaldınız!");







    }
}
