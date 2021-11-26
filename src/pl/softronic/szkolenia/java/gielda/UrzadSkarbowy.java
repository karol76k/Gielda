package pl.softronic.szkolenia.java.gielda;

import java.util.Map;
import java.util.TreeMap;

public class UrzadSkarbowy {
    private String nazwa = "";
    protected String adres = "";

    private Map<Integer, Podatek> listaPodatkow = new TreeMap();

    public boolean zarejestrujPodatek(Podatek podatek){
        boolean zarejestrowano = true;

        //Wyznaczamy id, bo Gielda nie zna naszej numeracji
        int id = listaPodatkow.size() + 1;
        listaPodatkow.put(id, podatek);

        return zarejestrowano;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Urząd Skarbowy{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}