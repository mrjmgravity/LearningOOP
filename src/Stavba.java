public class Stavba {

    protected float rozloha;
    protected int pocetPoschodi;

    public float vypocetCenyDomu(int cenaZaMeter, String menoDomu) {
        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoDomu + ": " + cena + " €");
        return cena;
    }

}
