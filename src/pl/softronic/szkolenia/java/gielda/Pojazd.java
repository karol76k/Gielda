package pl.softronic.szkolenia.java.gielda;

import java.text.DateFormat;
import java.util.Date;

public class Pojazd {

    private int id =0;
    private String typPojazdu;
    private String marka ;
    private String status;
    private int rok;
    private float cena;
    private int idWlasciciel;
    private int idSprzedawca;
    private int idKupujacy;
    private Date dataZgloszenia;
    private Date dataSprzedazy;
    private Date dataWycofania;

    private Pojazd(){

    }

    public Pojazd(String typPojazdu, String marka, int rok, float cena, int idWlasciciel, int idSprzedawca) {
        this.typPojazdu = typPojazdu;
        this.marka = marka;
        //this.status = status;
        this.rok = rok;
        this.cena = cena;
        this.idWlasciciel = idWlasciciel;
        this.idSprzedawca = idSprzedawca;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTypPojazdu() {
        return typPojazdu;
    }

    public String getMarka() {
        return marka;
    }

    public String getStatus() {
        return status;
    }

    public int getRok() {
        return rok;
    }

    public float getCena() {
        return cena;
    }

    public int getIdWlasciciel() {
        return idWlasciciel;
    }

    public int getIdSprzedawca() {
        return idSprzedawca;
    }

    public int getIdKupujacy() {
        return idKupujacy;
    }

    public Date getDataZgloszenia() {
        return dataZgloszenia;
    }

    public Date getDataSprzedazy() {
        return dataSprzedazy;
    }

    public Date getDataWycofania() {
        return dataWycofania;
    }
    //Setter


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public void setIdWlasciciel(int idWlasciciel) {
        this.idWlasciciel = idWlasciciel;
    }

    public void setDataZgloszenia(Date dataZgloszenia) {
        this.dataZgloszenia = dataZgloszenia;
    }

    public void setDataSprzedazy(Date dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public void setDataWycofania(Date dataWycofania) {
        this.dataWycofania = dataWycofania;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "typPojazdu='" + typPojazdu + '\'' +
                ", marka='" + marka + '\'' +
                ", rok=" + rok +
                ", cena=" + cena +
                '}';
    }
}
