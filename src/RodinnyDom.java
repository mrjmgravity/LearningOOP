public class RodinnyDom {

    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    public void vypocetCenyDomu(int cenaZaMeter){
        System.out.println(rozloha * cenaZaMeter * pocetPoschodi);
    }

}
