package poo.test1.util;

import poo.test1.Comparabil;

public class StivaDeComparabile {
    public Comparabil[] stiva;
    int nrCurentDeElemente;

    public StivaDeComparabile(int dimMaxStiva) {
        nrCurentDeElemente = 0;
        stiva = new Comparabil[dimMaxStiva];
    }

    public void afisareElemente() {
        if (nrCurentDeElemente == 0)
            System.out.println("Stiva nu contine elemente");
        else {
            System.out.println("Continutul stivei:");
            for (int i = nrCurentDeElemente - 1; i >= 0; i--) {
                System.out.println(stiva[i]);
            }
        }
    }

    public void adaugareElement(Comparabil elementNou) {
        if (nrCurentDeElemente == stiva.length)
            System.out.println("Nu exista spatiu disponibil in stiva");
        else {
            stiva[nrCurentDeElemente] = elementNou;
            nrCurentDeElemente++;
            System.out.println("Am adaugat un nou element in stiva: " + elementNou);
        }
    }

    public void eliminareElement() {
        if (nrCurentDeElemente == 0)
            System.out.println("Nu se pot elimina elemente dintr-o stiva goala");
        else {
            stiva[nrCurentDeElemente - 1] = null;
            nrCurentDeElemente--;
            System.out.println("Am eliminat un element din stiva");
        }
    }

    public void sortareElemente() {
        Comparabil swap;
        boolean stivaSortata = false;

        while (!stivaSortata) {
            stivaSortata = true;
            for (int i = 0; i < nrCurentDeElemente   - 1; i++) {
                if (stiva[i].comparaCu(stiva[i + 1]) == 1) {
                    swap = stiva[i];
                    stiva[i] = stiva[i + 1];
                    stiva[i + 1] = swap;
                    stivaSortata = false;
                }
            }
        }
        System.out.println("Elementele au fost sortate");
        System.out.println();
    }

}
