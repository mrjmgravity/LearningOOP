public class RodinnyDom extends Stavba {

    // ==== Atribúty ====

    private String material;
    private int pocetOken;

    // ==== Konštruktor ====
    public RodinnyDom(int pocetPoschodi, String material, float rozloha) {
        this.pocetPoschodi = pocetPoschodi;
        this.material = material;
        this.rozloha = rozloha;
    }

    // ==== Getre a setre ====
    public int getPocetPoschodi() {
        return pocetPoschodi;
    }

    public void setPocetPoschodi(int pocetPoschodi) {
        this.pocetPoschodi = pocetPoschodi;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getRozloha() {
        return rozloha;
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

    // ==== Ostatné metódy ====
    /**
     * Zmení rozlohu domu.
     */
    public void zmenaRozlohy(float novaRozloha) {
        this.rozloha = novaRozloha;
    }

    /**
     * Vypočíta cenu domu na základe rozlohy, počtu poschodí a ceny za meter.
     * @param cenaZaMeter cena za 1m²
     * @param menoDomu názov domu
     * @return výsledná cena
     */

}
