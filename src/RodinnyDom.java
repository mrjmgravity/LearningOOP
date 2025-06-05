public class RodinnyDom {

    private int pocetPoschodi;
    private String material;
    private float rozloha;
    private int pocetOken;

    public void zmenaRozlohy(float novaRozloha){
        rozloha = novaRozloha;
    }

    public float getRozloha(){
        return rozloha;
    }

    RodinnyDom(int pocetPoschodi, String material, float rozloha){
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }

    public float vypocetCenyDomu(int cenaZaMeter, String menoDomu) {

        float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoDomu + cena);

        return cena;
    }



}
