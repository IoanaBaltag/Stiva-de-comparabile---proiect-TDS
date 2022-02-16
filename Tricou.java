import poo.test1.Comparabil;

public class Tricou extends Comparabil {
    String denumire;
    int pret;
    // int marime;

    public void setNume(String numeNou) {
        this.denumire = numeNou;
    }

    public String getNume() {
        return this.denumire;
    }

    public void setPret(int pretNou) {
        this.pret = pretNou;
    }

    public int setPret() {
        return this.pret;
    }

    @Override
    public String toString() {
        return denumire + " la pretul de " + pret + " lei";
    }

    @Override
    public int comparaCu(Comparabil element) {
        Tricou tricouDeComparat = (Tricou) element;
        if (this.pret == tricouDeComparat.pret) {
            return 0;
        } else if (this.pret < tricouDeComparat.pret) {
            return -1;
        } else {
            return 1;
        }

    }
}
