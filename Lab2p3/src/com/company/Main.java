package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    String numeFis="cantec_in.txt";
    String numeOut="cantec_out.txt";
    String linie;
    Integer nrCuv;
    Integer nrVocale;

    System.out.println("Dati gruparea de litere");
    String grupare=scanner.nextLine();

    Vers[] versuri=new Vers[31];
        try (BufferedReader reader=new BufferedReader(new FileReader(numeFis))) {
        String versul;
        int ctr=-1;
        while((linie=reader.readLine())!=null) {
            ctr++;
            versuri[ctr]=new Vers(linie);
            versuri[ctr].Upper();
            versuri[ctr].terminare(grupare);
            System.out.println(ctr+" "+versuri[ctr].toString()+"  "+versuri[ctr].numarCuvinte()+"   "+versuri[ctr].nrVocale());

        }

    } catch (IOException e) {
            e.printStackTrace();
        }


        try(BufferedWriter writer=new BufferedWriter(new FileWriter(numeOut))) {
            for (int ctr = 0; ctr < versuri.length; ctr++) {
                String rezultat = ctr + " " + versuri[ctr].toString() + " " + versuri[ctr].numarCuvinte() + " " + versuri[ctr].nrVocale();
                // Scrie rezultatul în fișier
                writer.write(rezultat);
                writer.newLine(); // Treci la următoarea linie în fișier
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
