package vigenere;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> lettermap = new HashMap(26);
        lettermap.put("A", 0);
        lettermap.put("B", 1);
        lettermap.put("C", 2);
        lettermap.put("D", 3);
        lettermap.put("E", 4);
        lettermap.put("F", 5);
        lettermap.put("G", 6);
        lettermap.put("H", 7);
        lettermap.put("I", 8);
        lettermap.put("J", 9);
        lettermap.put("K", 10);
        lettermap.put("L", 11);
        lettermap.put("M", 12);
        lettermap.put("N", 13);
        lettermap.put("O", 14);
        lettermap.put("P", 15);
        lettermap.put("Q", 16);
        lettermap.put("R", 17);
        lettermap.put("S", 18);
        lettermap.put("T", 19);
        lettermap.put("U", 20);
        lettermap.put("V", 21);
        lettermap.put("W", 22);
        lettermap.put("X", 23);
        lettermap.put("Y", 24);
        lettermap.put("Z", 25);
        System.out.println("Bonjour");
        System.out.println(lettermap);
    }
}
