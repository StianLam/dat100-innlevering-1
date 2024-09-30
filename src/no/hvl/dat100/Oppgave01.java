package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv inn bruttoinntekt: ");
        double bruttoinntekt = scanner.nextDouble();
        
        double trinnskatt = beregnTrinnskatt(bruttoinntekt);
        
        System.out.printf("Trinnskatt å betale: %.2f kroner%n", trinnskatt);
        
        scanner.close();
    }
    
    public static double beregnTrinnskatt(double inntekt) {
        double skatt = 0;
        
        if (inntekt > 1_350_000) {
            skatt += (inntekt - 1_350_000) * 0.176;
            inntekt = 1_350_000;
        }
        
        if (inntekt > 937_900) {
            skatt += (inntekt - 937_900) * 0.166;
            inntekt = 937_900;
        }
        
        if (inntekt > 670_000) {
            skatt += (inntekt - 670_000) * 0.136;
            inntekt = 670_000;
        }
        
        if (inntekt > 292_850) {
            skatt += (inntekt - 292_850) * 0.04;
            inntekt = 292_850;
        }
        
        if (inntekt > 208_050) {
            skatt += (inntekt - 208_050) * 0.017;
        }
        
        return skatt;
    }
}