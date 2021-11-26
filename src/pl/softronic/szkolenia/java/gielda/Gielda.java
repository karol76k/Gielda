package pl.softronic.szkolenia.java.gielda;

import java.util.Vector;

public class Gielda {

    private String nazwa = "";
    protected String adres = "";

    Vector listaSamochodowOsobowych = new Vector();
    Vector<Sprzedawca> listaSprzedawcow = new Vector();


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

        // Uzyje zmiennej lokalnej zeby widac bylo roznice miedzy Vector - dla samochodow
        // a lista sprzedawcow

        SamochodOsobowy samOs;
        if (this.listaSamochodowOsobowych.size()==0){
            System.out.println("Brak samochodow na gieldzie ");
        } else {
            System.out.println("Liczba samochodow na gieldzie: " + this.listaSamochodowOsobowych.size());


            for (int i = 0; i<this.listaSamochodowOsobowych.size();  i++){
                //Tak powino byc
                //System.out.println(this.listaSamochodowOsobowych.elementAt(i));

                // ale dla celow szkoleniowych zrobimy jak ponizej
                // widac ze bez rzutowania ma klopot (blad)
                // czyli musimy rzutowac
                //samOs = this.listaSamochodowOsobowych.elementAt(i);

                // z rzutowaniem
                samOs = (SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i);
                System.out.println(samOs);
            }

        }

    }

    public void wycofajSamochod(int id) {
        int idPom = -1;

        for (int i = 0; i<this.listaSamochodowOsobowych.size();  i++){
            //WAZNE:
            idPom = ((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)).getId();
            if (idPom == id){
              //  ((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)).setStatus("W");

                ((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)).setStatus(Pojazd.WYCOFANY);


                System.out.println("Wycofano " +((SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i)));
            }
            //System.out.println(this.listaSamochodowOsobowych.elementAt(i));
        }
    }

    public void zatrudnijSprzedawce(Sprzedawca sprzedawca) {
        this.listaSprzedawcow.add(sprzedawca);

        // Vector typu RAW, nie zapewnie kontroli tego co wprowadzamy na liste
        // gdy zmenilismy na
        //this.listaSprzedawcow.add(new Float(23f));
        //this.listaSprzedawcow.add("Tekst, na pewno nie jest sprzedawca"));



    }

    public void wyswietlSprzdawcow() {
        Sprzedawca sp;
        if (this.listaSprzedawcow.size()==0){
            System.out.println("Nie zatrudnilismy sprzedawcow ");
        } else {
            //System.out.println("Liczba samochodow na gieldzie: " + this.listaSamochodowOsobowych.size());


            for (int i = 0; i<this.listaSprzedawcow.size();  i++){

                sp = this.listaSprzedawcow.elementAt(i);
                System.out.println(sp);
            }

        }

    }

}
