class Veicolo {
    protected String marca;
    protected int anno;

    public Veicolo(String marca, int anno) 
    {
        this.marca = marca;
        this.anno = anno;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void anno(int anno) 
    {
        this.anno = anno;
    }

    public int getanno() 
    {
        return anno;
    }

    public void descrizione() 
    {
        System.out.println("marca: " + marca + ", anno di produzione: " + anno);
    }

}

class Automobile extends Veicolo 
{
    private int numeroPosti;
    private int numeroPorte;

    public Automobile (String marca, int anno, int numeroPosti, int numeroPorte) 
    {
        super(marca, anno);
        this.numeroPosti = numeroPosti;
        this.numeroPorte = numeroPorte;
    }

    public void setNumeroPosti(int numeroPosti) 
    {
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroPosti() 
    {
        return numeroPosti;
    }

    public void setNumeroPorte(int numeroPorte) 
    {
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() 
    {
        return numeroPorte;
    }

    @Override
    public void descrizione() 
    {
        System.out.println("Automobile");
        System.out.println("marca: " + this.marca + ", anno di produzione: " + this.anno + ", numero porte: " + numeroPorte + ", numero posti: " + numeroPosti);
    }

}

class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, int anno, int cilindrata) 
    {
        super(marca, anno);
        this.cilindrata = cilindrata;
    }

    public void setCilindrata(int cilindrata) 
    {
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() 
    {
        return cilindrata;
    }

    @Override
    public void descrizione() 
    {
        System.out.println("Moto");
        System.out.println("marca: " + this.marca + ", anno di produzione: " + this.anno + ", cilindrata: "
                + cilindrata);
    }

}

public class veicoli {
    public static void main(String[] args) 
    {

        Automobile a1 = new Automobile("bentley", 2015, 3, 2);
        a1.descrizione();

        Moto m1 = new Moto("kawasaki", 2019, 125);
        m1.descrizione();
    }
}