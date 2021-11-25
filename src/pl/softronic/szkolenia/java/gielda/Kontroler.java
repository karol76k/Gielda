package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;

public class Kontroler {

    Gielda gielda;
    UrzadSkarbowy us;
    Pojazd pojazd;
    SamochodOsobowy so;
    Zaglowka zaglowka;

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


    public void testujGielde() {
        System.out.println("Testuję giełdę");
        System.out.println(gielda);
        System.out.println(us);

        //Testujemy pojazd
        pojazd = new Pojazd("O", "Aston Martin", 1958, 300_000f, 1, 1);
        System.out.println(pojazd);

        so= new SamochodOsobowy("O", "Aston Martin", 1958, 300_000f, 1, 1);
        so.setLiczbaMiejsc(5);
        so.setNadwozie("coupe");
        System.out.println(so);
        //TODO: data do poprawienia
        //so.setDataPrzegladu.parse("2021-01-03");

        zaglowka= new Zaglowka("Z", "Carina", 1978, 230_000f, 1, 1);
        zaglowka.setDlugosc(33);
        zaglowka.setPowZagli(50);
        //LocalDate ddd = LocalDate.now();
        zaglowka.setDataPrzegladu(LocalDate.now());
        System.out.println(zaglowka);


    }


}
