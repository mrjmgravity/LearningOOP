import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        generator.nextInt();


        RodinnyDom ficovaVila = new RodinnyDom(10,"tehla",60);
        float cenaPrvehoDomu = ficovaVila.vypocetCenyDomu(1, "Robert Fico ");

        RodinnyDom kalinakovDom = new RodinnyDom(11,"tehla",120);
        float cenaDruhehoDomu = kalinakovDom.vypocetCenyDomu(2, "Robert Kalinak ");

        System.out.println(kalinakovDom.getRozloha());

        System.out.println("Cena obidvoch domov dokopy je: " + (cenaPrvehoDomu + cenaDruhehoDomu));

        Obchod kaufland = new Obchod(2600f,2,5);
        kaufland.vypocetCenyObchodu();

    }
}
