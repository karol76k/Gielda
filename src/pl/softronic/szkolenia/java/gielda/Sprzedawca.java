package pl.softronic.szkolenia.java.gielda;

public class Sprzedawca {
    private int id;
    private String personalia;

    public Sprzedawca(int id, String personalia) {
        this.id = id;
        this.personalia = personalia;

    }

    @Override
    public String toString() {
        return "Sprzedawca{" +
                "id=" + id +
                ", personalia='" + personalia + '\'' +
                '}';
    }
}
