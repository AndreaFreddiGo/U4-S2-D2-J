package es1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        customSet();
    }

    public static void customSet() {
        HashSet<String> stringSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero N: ");
        if (!scanner.hasNextInt() || scanner.nextInt() <= 0) {
            System.out.println("Errore: il numero inserito non è valido.");
        } else {
            int N = scanner.nextInt();
            for (int i = 1; i <= N; i++) {
                System.out.println("Inserisci una parola: ");
                if (!stringSet.add(scanner.next())) {
                    System.out.println("Errore: la parola " + scanner.next() + " è già presente nel set.");
                } else {
                    stringSet.add(scanner.next());
                }
            }
        }
        scanner.close();
        System.out.println("Il set contiene " + stringSet.size() + " elementi.");
        System.out.println("Elementi del set: ");
        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}