package src.egitim;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int a , b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenar uzunluğunu girin: ");
        a = girdi.nextInt();
        System.out.print("2.Kenar uzunluğunu girin: ");
        b = girdi.nextInt();

        c = Math.sqrt(( a * a) + ( b * b));
        System.out.println("hipotenüs: " + c );




    }
}