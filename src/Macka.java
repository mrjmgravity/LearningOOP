public class Macka extends Zviera {

    private int pocetZjedenychRyb;

    Macka(int pocetNoh, String rasa, float hmotnost, int pocetZjedenychRyb){

        this.pocetNoh = pocetNoh;
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.pocetZjedenychRyb = pocetZjedenychRyb;

    }

    public void spravZvuk(){

        System.out.println("Mnau");

    }

}
