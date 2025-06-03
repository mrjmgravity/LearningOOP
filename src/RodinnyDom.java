public class RodinnyDom {

    int pocetPoschodi;
    String material;
    float rozloha;
    int pocetOken;

    public void vypocetCenyDomu(){
        System.out.println(rozloha * 8000 * pocetPoschodi);
    }

}
