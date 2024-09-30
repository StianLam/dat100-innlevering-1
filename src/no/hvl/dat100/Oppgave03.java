package no.hvl.dat100;
import java.util.Scanner;

public class Oppgave03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Skriv inn et positivt heltall: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Det er ikke et gyldig heltall. Prøv igjen.");
                scanner.next();
            }
            n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Tallet må være større enn 0. Prøv igjen.");
            }
        } while (n <= 0);
        
        long fakultet = beregnFakultet(n);
        
        System.out.println(n + "! = " + fakultet);
        
        scanner.close();
    }
    
    public static long beregnFakultet(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long resultat = 1;
        for (int i = 2; i <= n; i++) {
            resultat *= i;
        }
        
        return resultat;
    }
}