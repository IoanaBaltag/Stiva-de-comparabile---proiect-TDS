import java.util.Random;

import poo.test1.util.StivaDeComparabile;

public class Teste {
    public static void main(String[] args) {
        StivaDeComparabile stiva = new StivaDeComparabile(10);
        stiva.afisareElemente();
        System.out.println();

        Random rand = new Random();
        int iteratii = 1;
        while (iteratii <= 9) {
            Tricou tricou = new Tricou();
            tricou.setNume("tricou" + iteratii);
            tricou.setPret(10 + rand.nextInt(150));
            stiva.adaugareElement(tricou);
            iteratii++;
        }
        System.out.println();
        stiva.afisareElemente();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            stiva.eliminareElement();
        }
        System.out.println();

        stiva.afisareElemente();
        System.out.println();

        stiva.sortareElemente();
        stiva.afisareElemente();
        System.out.println();

    }
}