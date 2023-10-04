package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Vers {
    private String text;

    public Vers(String text) {
        this.text=text;
    }

    public int numarCuvinte() {
        String[] cuvinte=text.split("\\s+");
        return cuvinte.length;
    }

    public int nrVocale() {
        String lower=text.toLowerCase();
        int nrVocale=0;
        for(int i=0; i<lower.length(); i++) {
            char caracter=lower.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                nrVocale++;
            }
        }

        return nrVocale;
    }

    public String toString() {
        return text;
    }

    public void terminare(String grupare) {
        boolean seTermina=text.endsWith(grupare);
        if(seTermina)
            text=text+"*";
    }

    public void Upper() {
        double valoare=Math.random();
        if(valoare<=0.1)
            text=text.toUpperCase();
    }

}
