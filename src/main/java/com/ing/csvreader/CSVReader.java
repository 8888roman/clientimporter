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


@Component
public class CSVReader {




    public List<String[]> read() {


        String[] klient = null;
        String csvFile = "/klienci.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<String[]> clients = new ArrayList<String[]>();

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                if (!(line.startsWith("nr_klienta"))) {
                    // use comma as separator
                    klient = line.split(cvsSplitBy);



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

    }
}



