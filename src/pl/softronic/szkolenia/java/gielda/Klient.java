package pl.softronic.szkolenia.java.gielda;

public class Klient {
    private String pesel = "";
    private String personalia = "";

    public Klient(String pesel, String personalia) {
        this.pesel = pesel;
        this.personalia = personalia;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPersonalia() {
        return personalia;
    }

    public void setPersonalia(String personalia) {
        this.personalia = personalia;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "pesel='" + pesel + '\'' +
                ", personalia='" + personalia + '\'' +
                '}';
    }
}