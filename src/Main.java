import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        generator.nextInt();


        RodinnyDom ficovaVila = new RodinnyDom();
        ficovaVila.pocetPoschodi = 5;
        ficovaVila.rozloha = 80f;
        ficovaVila.material = "tehla";
        ficovaVila.pocetOken = 250;
        float cenaPrvehoDomu = ficovaVila.vypocetCenyDomu(1, "Robert Fico ");

        RodinnyDom kalinakovDom = new RodinnyDom();
        kalinakovDom.pocetPoschodi = 6;
        kalinakovDom.rozloha = 92f;
        kalinakovDom.material = "tehla";
        kalinakovDom.pocetOken = 322;
        float cenaDruhehoDomu = kalinakovDom.vypocetCenyDomu(2, "Robert Kalinak ");

        System.out.println("Cena obidvoch domov dokopy je: " + (cenaPrvehoDomu + cenaDruhehoDomu));


    }
}
