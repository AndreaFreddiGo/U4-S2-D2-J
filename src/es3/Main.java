package es3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> rubrica = new HashMap<>();
        rubrica.put("Bazanna", "340-1234567");
        rubrica.put("Gibanna", "341-1234567");
        rubrica.put("Toomanna", "342-1234567");
        rubrica.put("Peppanna", "343-1234567");

        stampRubrica(rubrica);

        addRubrica(rubrica);

        removeRubrica(rubrica);

        searchNameRubrica(rubrica);

        searchNumberRubrica(rubrica);
    }

    public static void stampRubrica(HashMap<String, String> rubrica) {
        System.out.println("La tua rubrica contiene i seguenti contatti: ");
        for (String name : rubrica.keySet()) {
            System.out.println(name + " - " + rubrica.get(name));
        }
    }

    public static void addRubrica(HashMap<String, String> rubrica) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del nuovo contatto: ");
        String name = scanner.nextLine();
        System.out.println("Inserisci il numero di telefono del nuovo contatto: ");
        String number = scanner.nextLine();
        rubrica.put(name, number);
        stampRubrica(rubrica);
    }

    public static void removeRubrica(HashMap<String, String> rubrica) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del contatto da rimuovere: ");
        String name = scanner.nextLine();
        if (rubrica.containsKey(name)) {
            rubrica.remove(name);
        } else {
            System.out.println("Il contatto non è presente nella rubrica");
        }
        stampRubrica(rubrica);
    }

    public static void searchNameRubrica(HashMap<String, String> rubrica) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del contatto da ricercare: ");
        String name = scanner.nextLine();
        if (rubrica.containsKey(name)) {
            System.out.println(name + " - " + rubrica.get(name));
        } else {
            System.out.println("Il contatto non è presente nella rubrica");
        }
    }

    public static void searchNumberRubrica(HashMap<String, String> rubrica) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero del contatto da ricercare: ");
        String number = scanner.nextLine();
        if (rubrica.containsValue(number)) {
            for (String name : rubrica.keySet()) {
                if (rubrica.get(name).equals(number)) {
                    System.out.println(name + " - " + rubrica.get(name));
                }
            }
        } else {
            System.out.println("Il numero non è presente nella rubrica");
        }
    }
}