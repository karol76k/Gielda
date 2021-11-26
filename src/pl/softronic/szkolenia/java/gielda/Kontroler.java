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

    public void tworzGielde() {
        System.out.println("Tworzę giełdę");

        //Tworzymy giełdę
        gielda = new Gielda();
        gielda.setNazwa("Giełda wspaniałych pojazdów");
        gielda.adres = "Warszawa ul. Jasna ";


        //Tworzymy Urząd Skarbowy
        us = new UrzadSkarbowy();
        us.setNazwa("Urząd Skarbowy - Warszawa Praga");
        us.adres = "Warszawa ul. Jagiellońska 15 ";

        gielda.setUrzadSkarbowy(us);



    }

    public void testujGielde(){
        System.out.println("Testuję giełdę");

        System.out.println(gielda);
        System.out.println(us);

        //Testujemy pojazd
        pojazd = new Pojazd("O","Aston Martin",1958, 300_000f, 1,1);
        System.out.println(pojazd);

        //Testujemy samochód osbowy
        so = new SamochodOsobowy("O","Aston Martin",1958, 300_000f, 1,1);
        so.setLiczbaMiejsc(5);
        so.setNadwozie("coupe");


        //Samochody do testu
        SamochodOsobowy so1 = new SamochodOsobowy("O","Polonez",1958, 300_000f, 1,1);
        SamochodOsobowy so2 = new SamochodOsobowy("O","Ford",1958, 300_000f, 1,1);
        SamochodOsobowy so3 = new SamochodOsobowy("O","Dacia",1958, 300_000f, 1,1);


        //TODO: "Trzeba odkomentować i poprawić ustawienie daty";
        //so.setDataPrzegladu(LocalDate.parse("23-02-2021"));
        System.out.println(so);

        //Testujemy zaglowke
        zaglowka = new Zaglowka("Z","Carina",1978, 30_000f, 1,1);
        zaglowka.setLiczbaMiejsc(5);
        zaglowka.setPowZagli(14f);
        System.out.println(zaglowka);

        //Testowanie przyjmownia pojazdu na giełdę.
        /*
        1. Utworzyć pojazd
        2. Gielda
        3. idSprzedawcy
        4. idWlasciciela
        5. Zaglowke lub SamochodOsobowy
        6.metodę, która nam zarejestruje fakt przyjęcia
        sygantura metody:
        nazwaMetody(SamochodOsobowy lub Zaglowka, idKlienta, idWlasciciela)
        dwie metody:
            przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, SamochodOsobowy)
            przyjmijZaglowke(idSprzedawcy, idWlasciciela, Zaglowka)
            Gdzie (w jakim obiekcie)?
            Giełda
        */

        //Dla celów testowych udajemy że mamy właściciela i sprzedawcę
        int idSprzedawcy = 2;
        int idWlasciciela = 10;

        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so1);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so2);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so3);

        gielda.wycofajSamochod(3);

        //Jakie samochody są na giełdzie
        gielda.wyswietlSamochodyOsobowe();

        //Testujemy klientów dwóch
        Klient kl1 = new Klient("1234","Jan Kowalski");
        Klient kl2 = new Klient("1235","Jan Wiśniewski");

        System.out.println(kl1);
        System.out.println(kl2);

        //Testujemy  dwóch sprzedawców
        Sprzedawca sp1 = new Sprzedawca(1,"Jan Kowalski");
        Sprzedawca sp2 = new Sprzedawca(2,"Jan Wiśniewski");

        //Powinniśmy wprowadzić na ich na listę sprzedawców na Giełdzie
        gielda.zatrudnijSprzedawce(sp1);
        gielda.zatrudnijSprzedawce(sp2);

        //System.out.println(sp1);
        //System.out.println(sp2);

        gielda.wyswietlListeSprzedawcow();

        //Testujemy  dwa podatki
        Podatek p1 = new Podatek(1,"1234", 2_000f);
        Podatek p2 = new Podatek(2,"1234", 3000f);

        System.out.println(p1);
        System.out.println(p2);

        gielda.sprzedajSamochodOsobowy(1, "1234",2);
        //Jakie samochody są na giełdzie
        gielda.wyswietlSamochodyOsobowe();

    }

    private void wczytajDane() {

    }
}