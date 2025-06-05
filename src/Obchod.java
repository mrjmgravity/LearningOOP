public class Obchod {

    private float rozloha;
    private int pocetPoschodi;
    private int pocetPokladni;


    Obchod(float rozloha, int pocetPoschodi, int pocetPokladni) {

        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladni = pocetPokladni;
    }

    public float vypocetCenyObchodu() {

        float cena = (rozloha * pocetPoschodi) + 100 * pocetPokladni;
        System.out.println("Cena obchodu " + cena);
        return cena;
    }

}
