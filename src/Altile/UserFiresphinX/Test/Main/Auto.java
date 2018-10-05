package Altile.UserFiresphinX.Test.Main;

public class Auto {
    private int anzahlRäder;
    private int anzahlSitze;
    private int anzahlTüren;
    private int ps;
    private String name;

    public Auto(int anzahlRäder, int anzahlSitze, int anzahlTüren, int ps, String name) {
        this.anzahlRäder = anzahlRäder;
        this.anzahlSitze = anzahlSitze;
        this.anzahlTüren = anzahlTüren;
        this.ps = ps;
        this.name = name;
    }

    void pimpen(int x) {
        this.ps += x;
    }

    public int wieVielPS() {
        return this.ps;
    }

    public void hupen(int x) {
        while (--x > 0) {
            System.out.println("Miep MIIIEP");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String autoname) {
        this.name = autoname;
    }


}
