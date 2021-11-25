package pl.softronic.szkolenia.java.gielda;

public class Kontroler {

    Gielda gielda;
    UrzadSkarbowy us;
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

        // Tworzymy Urzad Skarbowy
        us = new UrzadSkarbowy();
        us.setNazwa("Urzad skarbowy");
        us.adres = "Warszawa ul. Zlota 5";

    }


    public void testujGielde(){
        System.out.println("Testuję giełdę");
        System.out.println(gielda);
        System.out.println(us);
    }



}
