public class Frazione {
    // Campi
    private int numeratore;
    private int denominatore;
    // Costruttore

    public Frazione(int numeratore, int denominatore) 
    {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
    // Metodo per ottenere il numeratore
    public int getNumeratore() 
    {
        return numeratore;
    }

    public int getDenominatore() 
    {
        return denominatore;
    }

    @Override
    public String toString() 
    {
        return numeratore + "/" + denominatore;
    }

    public Frazione somma(Frazione altraFrazione) 
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                + altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
}