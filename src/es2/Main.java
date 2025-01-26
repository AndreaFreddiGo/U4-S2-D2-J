package es2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int N = 7;
        ArrayList<Integer> intList = new ArrayList<>();
        intList(intList, N);
        concatList(intList, N);
    }

    public static ArrayList<Integer> intList(ArrayList<Integer> intList, int N) {
        for (int i = 0; i < N; i++) {
            int randomNum = (int) (Math.random() * 101);
            intList.add(randomNum);
        }
        System.out.println("La lista di " + N + " numeri interi generati casualmente è: " + intList);
        return intList;
    }

    public static ArrayList<Integer> concatList(ArrayList<Integer> intList, int N) {
        ArrayList<Integer> invertedList = new ArrayList<>();
        int i = 0;
        for (int y = N - 1; y >= 0; y--) {
            invertedList.add(intList.get(y));
            i++;
        }
        ArrayList<Integer> mirrorList = new ArrayList<>();
        mirrorList.addAll(intList);
        mirrorList.addAll(invertedList);
        System.out.println("La lista 'specchio' è: " + mirrorList);
        return mirrorList;
    }
}