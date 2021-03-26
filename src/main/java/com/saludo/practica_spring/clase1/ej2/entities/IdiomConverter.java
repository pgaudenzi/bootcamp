package com.saludo.practica_spring.clase1.ej2.entities;


import lombok.Data;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Data
public class IdiomConverter {

    // Morse code by indexing
    final static String[] CODE
            = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };

    public String morseToEnglish(String morseCode) {
        if (morseCode == null) {
            morseCode = ".... --- .-.. .-";
        }

        // morse code to English Hashmap
        Map<String, Character> morseToEnglish
                = new HashMap<>();
        // Map value allocation
        for (int i = 0; i < 26; i++) {
            morseToEnglish.put(CODE[i], (char)('a' + i));
        }
        // Split morse code in array of string
        String[] array = morseCode.split(" ");

        StringBuilder english = new StringBuilder();
        // Morse code to English
        for (String s : array) {
            if (morseToEnglish.containsKey(s)) {
                english.append(morseToEnglish.get(s));
            } else {
                english.append(" ");
            }

        }
        return english.toString().toUpperCase(Locale.ROOT);
    }

    public static void englishToMorse(String[] code,
                                      String englishLang)
    {
        for (int i = 0; i < englishLang.length(); i++) {
            System.out.print(
                    code[englishLang.charAt(i) - 'a'] + " ");
        }
    }

}
