package com.ing.csvreader;

/**
 * Created by Roman on 2017-03-06.
 */

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class CSVReader {

//public String wynik;
//public String[] klient;


    public List<String[]> read() {

        String wynik = null;
        String[] klient = null;
        String csvFile = "/klienci.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        // List<String[]> clients =null;
        List<String[]> clients = new ArrayList<String[]>();

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                if (!(line.startsWith("nr_klienta"))) {
                    // use comma as separator
                    klient = line.split(cvsSplitBy);


//                    wynik = "Klient [nr= " + klient[0] + " , name=" + klient[1] + ", region=" + klient[2] +
//                            ", branza=" + klient[3] + ", telefon=" + klient[4] + ", email=" + klient[5] + ", dzialanosc od=" + klient[6] + "]";
//                    System.out.println(wynik);
                    clients.add(klient);

                }
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
        return clients;
        // TODO: 2017-03-07 wewnatrz reada dodac liste tablicy stringów i dodawac przez list.add 
    }
}



