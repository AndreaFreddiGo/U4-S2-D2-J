package es1;

import es1.exceptions.NotValidIntegerException;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        customSet();
    }

    public static void customSet() {
        HashSet<String> stringSet = new HashSet<>();
        boolean correctInput = false;
        while (!correctInput) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un numero intero N: ");
            try {
                int N = Integer.parseInt(scanner.nextLine());
                if (N <= 0) throw new NotValidIntegerException("Il numero deve essere maggiore di 0");
                correctInput = true;
            } catch (NotValidIntegerException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Il valore inserito non è un numero intero");
            }
        }
    }
}