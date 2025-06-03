public class RodinnyDom {

    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    public void vypocetCenyDomu(int cenaZaMeter, String menoDomu){
        System.out.println(menoDomu + (rozloha * cenaZaMeter * pocetPoschodi));
    }

}
