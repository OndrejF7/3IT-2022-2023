package sk.sosholic.prvyppolrok.hadaniecisla;


import java.util.Random;
import java.util.Scanner;

public class HadanieCisla {
    public static void main(String[] args) {
        Random r = new Random();
        int low = 0;
        int high = 10001;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je hra na hladanie cisla od 1 do 10000");
        System.out.println("Mas 10 pokusov");
        while (true) {
            System.out.println("zadaj cislo:  ");
            int cislo = scanner.nextInt();
            System.out.println("Zadane cislo je: " + cislo);
            int cisloKtoreTrebaUhadnut = 0;
            boolean rovna = cislo<cisloKtoreTrebaUhadnut;
            if (cislo>cisloKtoreTrebaUhadnut);
            {
                System.out.println("zadane cislo" + cislo + "je vecsie");
            }if (rovna) {
                    System.out.println("zadane cislo " + cislo + "je mensie");
                int pokusy = scanner.nextInt();

            }
        }
    }
}