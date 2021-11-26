package pl.softronic.szkolenia.java.gielda;

public class Podatek {
    int id;
    String peselKlienta;
    float kwota;

    public Podatek(int id, String peselKlienta, float kwota) {
        this.id = id;
        this.peselKlienta = peselKlienta;
        this.kwota = kwota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeselKlienta() {
        return peselKlienta;
    }

    public void setPeselKlienta(String peselKlienta) {
        this.peselKlienta = peselKlienta;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "Podatek{" +
                "id=" + id +
                ", peselKlienta='" + peselKlienta + '\'' +
                ", kwota=" + kwota +
                '}';
    }
}