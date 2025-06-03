import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();


        RodinnyDom ficovaVila = new RodinnyDom();
        ficovaVila.pocetPoschodi = 5;
        ficovaVila.rozloha = 600f;
        ficovaVila.material = "tehla";
        ficovaVila.pocetOken = 250;
        ficovaVila.vypocetCenyDomu();

        RodinnyDom kalinakovDom = new RodinnyDom();
        kalinakovDom.pocetPoschodi = 6;
        kalinakovDom.rozloha = 728f;
        kalinakovDom.material = "tehla";
        kalinakovDom.pocetOken = 322;


    }
    }
