package pl.softronic.szkolenia.java.gielda;

import java.security.PublicKey;
import java.time.LocalDate;


public class SamochodOsobowy extends Pojazd{
    private int liczbaMiejsc = 5;
    private String nadwozie = "sedan";
    private int pojemnosc = 0;
    private LocalDate dataPrzegladu;

    public SamochodOsobowy(String typPojazdu, String marka, int rok, float cena, int idWlasciciel, int idSprzedawca) {
        super(typPojazdu, marka, rok, cena, idWlasciciel, idSprzedawca);
    }

    public SamochodOsobowy(String typPojazdu, String marka, int rok, float cena, int idWlasciciel, int idSprzedawca,
                           int liczbaMiejsc, String nadwozie, int pojemnosc, LocalDate dataPrzegladu) {
        super(typPojazdu, marka, rok, cena, idWlasciciel, idSprzedawca);

        this.liczbaMiejsc = liczbaMiejsc;
        this.nadwozie = nadwozie;
        this.pojemnosc = pojemnosc;
        this.dataPrzegladu = dataPrzegladu;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public LocalDate getDataPrzegladu() {
        return dataPrzegladu;
    }

    public void setDataPrzegladu(LocalDate dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    @Override
    public String toString() {
        return "SamochodOsobowy{" +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", nadwozie='" + nadwozie + '\'' +
                ", pojemnosc=" + pojemnosc +
                //", dataPrzegladu=" + dataPrzegladu +
                '}';
    }
}
