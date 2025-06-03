public class RodinnyDom {

    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    public void vypocetCenyDomu(int cenaZaMeter, String menoDomu){

        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoDomu + cena);
    }

}
