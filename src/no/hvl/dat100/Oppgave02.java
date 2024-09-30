package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            int poengsum;
            do {
                System.out.print("Skriv inn poengsum for student " + i + " (0-100): ");
                poengsum = scanner.nextInt();
                
                if (poengsum < 0 || poengsum > 100) {
                    System.out.println("Ugyldig poengsum. Vennligst skriv inn en verdi mellom 0 og 100.");
                }
            } while (poengsum < 0 || poengsum > 100);
            
            char karakter = beregnKarakter(poengsum);
            System.out.println("Karakter for student " + i + ": " + karakter);
            System.out.println(); // Legger til en tom linje for bedre lesbarhet
        }
        
        scanner.close();
    }
    
    public static char beregnKarakter(int poengsum) {
        if (poengsum >= 90) {
            return 'A';
        } else if (poengsum >= 80) {
            return 'B';
        } else if (poengsum >= 60) {
            return 'C';
        } else if (poengsum >= 50) {
            return 'D';
        } else if (poengsum >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }
}