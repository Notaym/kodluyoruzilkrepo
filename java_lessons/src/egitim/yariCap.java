package src.egitim;

import java.util.Scanner;

public class yariCap {
    public static void main(String[] args) {

        double pi = 3.14 ,  r , a , alan ;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("dairenin yarı çapını giriniz: ");
            r = input.nextDouble();

            System.out.print("merkez acısının ölçüsünü gitiniz: ");
            a = input.nextDouble();

            alan =(pi * ( r * r) * a) / 360;
            System.out.print("alanınız: " + alan);

        }

    }
}