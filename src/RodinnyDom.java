public class RodinnyDom {

    private int pocetPoschodi;
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPocetPoschodi() {
        return pocetPoschodi;
    }

    public void setPocetPoschodi(int pocetPoschodi) {
        this.pocetPoschodi = pocetPoschodi;
    }

    public void setRozloha(float rozloha) {
        this.rozloha = rozloha;
    }

    public int getPocetOken() {
        return pocetOken;
    }

    public void setPocetOken(int pocetOken) {
        this.pocetOken = pocetOken;
    }

    private float rozloha;
    private int pocetOken;

    public void zmenaRozlohy(float novaRozloha) {
        rozloha = novaRozloha;
    }

    public float getRozloha() {
        return rozloha;
    }

    RodinnyDom(int pocetPoschodi, String material, float rozloha) {
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
