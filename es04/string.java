import java.io.*;
import java.util.Scanner;

public class string {

    public static void main(String [] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola o frase: ");
        String par_fra = scanner.nextLine();

        par_fra.trim();

        System.out.println("parola o frase inserita: " + par_fra);

        int lunghezza = par_fra.length();
        System.out.println("lunghezza = " + lunghezza);

        char lettera_centrale = par_fra.charAt(lunghezza / 2);
        System.out.println("lettera centrale = " + lettera_centrale);

        par_fra = par_fra.substring(0,1).toUpperCase() + par_fra.substring(1);
        System.out.println("parola o frase modificata con prima lettera maiuscola = " + par_fra);

        int nOccorenzeA = 0;
        for (int i = 0; i < par_fra.length(); i++) 
        {
            if (par_fra.charAt(i) == 'a') 
            {
                nOccorenzeA++;
            }
        }
        System.out.println("Numero di occorrenze di 'a' = " + nOccorenzeA);

        String sottoStringa = par_fra.substring(0, 4);
        System.out.println("parola o frase dal primo al quarto carattere = " + sottoStringa);

        par_fra = par_fra.toUpperCase();
        System.out.println(par_fra);

        par_fra = par_fra.toLowerCase();
        System.out.println(par_fra);

        scanner.close();

    }
}