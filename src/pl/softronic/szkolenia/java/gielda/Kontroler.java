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

        SamochodOsobowy so1= new SamochodOsobowy("O", "BMW", 1999, 800_000f, 1, 1);
        SamochodOsobowy so2= new SamochodOsobowy("O", "Maluch", 2001, 230_000f, 1, 1);
        SamochodOsobowy so3= new SamochodOsobowy("O", "Ford", 2019, 190_000f, 1, 1);





        System.out.println(so);
        //TODO: data do poprawienia
        //so.setDataPrzegladu.parse("2021-01-03");

        zaglowka= new Zaglowka("Z", "Carina", 1978, 230_000f, 1, 1);
        zaglowka.setDlugosc(33);
        zaglowka.setPowZagli(50);
        //LocalDate ddd = LocalDate.now();
        zaglowka.setDataPrzegladu(LocalDate.now());
        System.out.println(zaglowka);

        /*
        1. utworzyc pojazd
        2. gielda
        3. idPracownika
        4. idKlienta
        5. zaglowka lub sam osobowy
        6. metoda ktora nam zarejestruje fakt przyjecie


         */
        int idSprzedawcy = 2;
        int idWlasciciel = 10;
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciel, so);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciel, so1);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciel, so2);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciel, so3);

        gielda.wycofajSamochod(3);


        // jakie samochody sa na gieldzie
        //zaimplementujemy metode wyswietlajaca liste samochodow bedacych na gieldzie
        gielda.wyswietlSamochodyOsobowe();

        //Test klientow
        Klient kl1 = new Klient("1234", "Jan Kowalski");
        Klient kl2 = new Klient("4321", "Adam Mickiewicz");

        System.out.println(kl1);
        System.out.println(kl2);

        //test sprzedawcow
        Sprzedawca sp1 = new Sprzedawca(1, "Wladek Lokietek");
        Sprzedawca sp2 = new Sprzedawca(2, "Kazimierz Nowak");

        //Powinnismy ich wprowadzic na liste sprzedawcow na Giledzie
        gielda.zatrudnijSprzedawce(sp1);
        gielda.zatrudnijSprzedawce(sp2);

       // System.out.println(sp1);
       // System.out.println(sp2);

        gielda.wyswietlSprzdawcow();
        //

        //test podatek
        Podatek p1 = new Podatek(1, "576576575", 200);
        Podatek p2 = new Podatek(2, "123452778", 786);

        System.out.println(p1);
        System.out.println(p2);
    }

}
