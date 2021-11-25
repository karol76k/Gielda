package pl.softronic.szkolenia.java.gielda;

public class Kontroler {
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
    }

    public void testujGielde(){
        System.out.println("Testuję giełdę");
    }



}
