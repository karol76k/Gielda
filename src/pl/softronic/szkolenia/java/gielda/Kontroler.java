package pl.softronic.szkolenia.java.gielda;

public class Kontroler {

    Gielda gielda;

    public void uruchomProgram() {
        //Uruchamia metody: tworzącą i testujacą giełdę

        tworzGielde();
        wczytajDane();
        testujGielde();
    }

    private void wczytajDane() {
        
    }

    public void tworzGielde() {

        System.out.println("Tworzę giełdę");

        gielda = new Gielda();
        gielda.setNazwa("Gielda wspanialych pojazdow");
        gielda.adres = "Warszawa ul. Samochodowa 4";
    }

    public void testujGielde(){
        System.out.println("Testuję giełdę");
        System.out.println(gielda);
    }



}
