package pl.softronic.szkolenia.java.gielda;

import java.util.Vector;

public class Gielda {

    private String nazwa = "";
    protected String adres = "";

    Vector listaSamochodowOsobowych = new Vector();


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

    public static void main(String[] args) {
        Kontroler kontroler = new Kontroler();
        kontroler.uruchomProgram();
    }

    @Override
    public String toString() {
        return "Gielda{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }

    public void przyjmijSamochodOsobowy(int idSprzedawcy, int idWlasciciel, SamochodOsobowy so) {

        int id = this.listaSamochodowOsobowych.size() +1;
        so.setId(id);
        this.listaSamochodowOsobowych.add(so);
        System.out.println("Przyjalem do sprzedazy samochod: " +so.toString());


    }

    public void wyswietlSamochodyOsobowe() {


        if (this.listaSamochodowOsobowych.size()==0){
            System.out.println("Brak samochodow na gieldzie ");
        } else {
            System.out.println("Liczba samochodow na gieldzie: " + this.listaSamochodowOsobowych.size());


            for (int i = 0; i<this.listaSamochodowOsobowych.size();  i++){
                System.out.println(this.listaSamochodowOsobowych.elementAt(i));
            }

        }

    }

    public void wycofajSamochod(int id) {
        int idPom = -1;

        for (int i = 0; i<this.listaSamochodowOsobowych.size();  i++){
            //WAZNE:
            idPom = ((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)).getId();
            if (idPom == id){
                ((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)).setStatus("W");
                System.out.println("Wycofano " +((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)));
            }
            //System.out.println(this.listaSamochodowOsobowych.elementAt(i));
        }
    }
}
