public class RodinnyDom {

    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    RodinnyDom(){
        System.out.println("Teraz sa vola konstruktor ");
    }

    public float vypocetCenyDomu(int cenaZaMeter, String menoDomu) {

        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoDomu + cena);

        return cena;
    }



}
