public class Banka {

    private int roky;
    private float pociatocnyVklad;
    private float urokovaSadzba;
    private float poplatky;
    private float konecnaCiastka;


    public Banka(int roky, float kapital, float urokovaSadzba, float poplatky, float konecnaCiastka) {
        this.roky = roky;
        this.pociatocnyVklad = kapital;
        this.urokovaSadzba = urokovaSadzba;
        this.poplatky = poplatky;
        this.konecnaCiastka = konecnaCiastka;
    }

    public float vypocetSporiacehoUctu(){

        konecnaCiastka = pociatocnyVklad;

        for(int i = 0; i < roky; i++ ){

            konecnaCiastka += konecnaCiastka * (urokovaSadzba/100 - poplatky);


        }

        return konecnaCiastka;
    }


}
