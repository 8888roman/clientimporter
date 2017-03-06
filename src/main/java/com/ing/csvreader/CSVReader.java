package com.ing.csvreader;

/**
 * Created by Roman on 2017-03-06.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

public String wynik;

    public String read() {



        String csvFile = "/Users/Roman/klienci.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] klient = line.split(cvsSplitBy);

                 wynik = "Klient [nr= " + klient[1] + " , name=" + klient[2] + ", region=" + klient[3] +
                          ", branza=" + klient[4] + ", telefon=" + klient[5] + ", email=" + klient[6] + ", dzialanosc od=" + klient[7] + "]";
                System.out.println("Klient [nr= " + klient[1] + " , name=" + klient[2] + ", region=" + klient[3] +
                        ", branza=" + klient[4] + ", telefon=" + klient[5] + ", email=" + klient[6] + ", dzialanosc od=" + klient[7] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return wynik;
    }

}


