package pl.softronic.szkolenia.java.gielda;

import java.security.PublicKey;

public class SamochodOsobowy extends Pojazd{
    private int liczbaMiejsc = 5;
    private String nadwozie = "sedan";
    private int pojemnosc = 0;

    public SamochodOsobowy(String typPojazdu, String marka, int rok, float cena, int idWlasciciel, int idSprzedawca) {
        super(typPojazdu, marka, rok, cena, idWlasciciel, idSprzedawca);
    }


}
