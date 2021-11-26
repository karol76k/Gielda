package pl.softronic.szkolenia.java.gielda;

import java.util.Vector;

public class Gielda {
    private String nazwa = "";
    protected String adres = "";
    private UrzadSkarbowy urzadSkarbowy;

    Vector listaSamochodowOsobowych = new Vector();
    Vector<Sprzedawca> listaSprzedawcow = new Vector();

    public static void main(String[] args) {
        Kontroler kontroler = new Kontroler();
        kontroler.uruchomProgram();
    }

    public void setUrzadSkarbowy(UrzadSkarbowy urzadSkarbowy) {
        this.urzadSkarbowy = urzadSkarbowy;
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
        return "Gielda{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }


    public void przyjmijSamochodOsobowy(int idSprzedawcy, int idWlasciciela, SamochodOsobowy so) {
        int id = this.listaSamochodowOsobowych.size() + 1;
        so.setId(id);
        so.setStatus(Pojazd.PRZYJETY);

        this.listaSamochodowOsobowych.add(so);
        System.out.println("Przyjąłem do sprzedaży samochód: " + so.toString());
    }

    public void sprzedajSamochodOsobowy(int idSprzedawcy, String peselKlienta, int idSamochodu) {
        Podatek podatek = null;
        SamochodOsobowy samOs = null;
        //Tu będą instrukcje przeprowadzające sprzedaż (na obiekcie Gielda)

        //TODO: Znaleźć samochód
        //Wstęp do pętli for
        for (int i = 0; i < this.listaSamochodowOsobowych.size(); i++) {
            //z rzutowaniem
            samOs = (SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i);
            if (samOs.getId() == idSamochodu){
                System.out.println("Sprzedajemy: " + samOs);
                break;
            }
        }

        //TODO:Zmienić status na "S"
        if (samOs != null){
            samOs.setStatus(Pojazd.SPZEDANY);
        } else {
            //Jeżeli nie znalazł to oznacza gdzieś jakiś błąd logiczny
            //To powinien wyświetlić komunikat o błędzie programu
            //i wyjść z metody
            System.out.print("Błąd w programie - nie znaleziono samochodu");
            return;
        }


        //TODO: policzyć wysokosc podatku
        float kwotaPod = samOs.getCena() * 0.05f;
        podatek = new Podatek(0,peselKlienta, kwotaPod);

        //TODO:  Tu zarejestrujemy podatek odproadzony
        urzadSkarbowy.zarejestrujPodatek(podatek);
    }


    public void wyswietlSamochodyOsobowe() {
        //Użyję zmiennej lokalnej, żeby było widać różnicę między Vector - dla listy samochodow odobowych
        //a listą sprzedawców
        SamochodOsobowy samOs;
        int aktualnaLiczbaDostepnychSamochodow = 0;

        if (this.listaSamochodowOsobowych.size() == 0) {
            System.out.println("Nie ma samochodów na placu");
        } else {
            //Wykomentowane datego że na liście są także samochody wycofane i sprzedane, a nie tylko te a placu
            //System.out.println("Liczba samochodów na placu: " + this.listaSamochodowOsobowych.size()  );

            //Wstęp do pętli for
            for (int i = 0; i < this.listaSamochodowOsobowych.size(); i++) {

                //Tak powinno być
                //System.out.println(this.listaSamochodowOsobowych.elementAt(i));

                //ale dla celów szkoleniowych zrobimy tak jak poniżej
                //i widać, że bez rzutowania ma kłopot (błąd)
                //czyli musimy rzutować
                //samOs = this.listaSamochodowOsobowych.elementAt(i);

                //z rzutowaniem
                samOs = (SamochodOsobowy)this.listaSamochodowOsobowych.elementAt(i);

                if (samOs == null){
                    System.out.println("samOs jest null");
                }

                if (samOs.getStatus().equals(Pojazd.PRZYJETY)){
                    aktualnaLiczbaDostepnychSamochodow++;
                    System.out.println(samOs);
                }
            }

            System.out.println("Liczba samochodów na placu: " + aktualnaLiczbaDostepnychSamochodow );

        }

    }

    public void wyswietlListeSprzedawcow() {
        Sprzedawca sp;

        if (this.listaSprzedawcow.size() == 0) {
            System.out.println("Nie zatrudniliśmy spzedawcówplacu");
        } else {
            //Wstęp do pętli for
            for (int i = 0; i < this.listaSprzedawcow.size(); i++) {
                //Teraz nie musimy rzutować
                sp = this.listaSprzedawcow.elementAt(i);
                System.out.println(sp);
            }
        }
    }

    public void wycofajSamochod(int id) {
        int idPom = -1;

        for (int i = 0; i < this.listaSamochodowOsobowych.size(); i++) {
            /*
            !!! Ważny moment
            listaSamochodów jest "Raw", czyli bez deklaracji typu obiektow na liście, czyli w taki sposób
            Vector listaSamochodowOsobowych = new Vector();
            To duża niedoróbka programistyczna
            Tak nie wolno robić!!!
            Gdyż aby dostać się do właściwości obiektu SamochodOsobowy, musmy wykonać rzutowanie
            czyli zrobić tak:
             */
            idPom = ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)).getId();

            if (idPom == id) {
                //Bałaganiarski sposób programowania
                //TODO: do refaktoringu - utworzyć tymczasowy obiekt SamochodOsobowy i na nim operaować

                //Tak nie wolno robić!!!
                //Nie wolno zaszwać literałów w kodzie w taki sposób "W"
                ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)).setStatus("W");

                //Poprawiona wersja poprzedniej instrukcji
                ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)).setStatus(Pojazd.WYCOFANY);

                System.out.println("Wycofano samochód: " + ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)));
            }

        }
    }

    public void zatrudnijSprzedawce(Sprzedawca sprzedawca) {
        this.listaSprzedawcow.add(sprzedawca);

        //Vector typu Raw, nie zapewnia kontroli tego co wpriwadzamy na listę
        //Tak nie powinno  być
        //Gdy zmieniliśmy na
        //this.listaSprzedawcow.add(new Float(23f));
        //this.listaSprzedawcow.add("tekst, który na pewno nie jest sprzawcą");



    }
}