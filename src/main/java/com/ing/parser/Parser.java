package com.ing.parser;

import com.ing.csvreader.CSVReader;
import com.ing.domain.Client;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Roman on 2017-03-06.
 */
@Component
public class Parser {





        public List<Client> parse(List<String[]> clientList){
        Client client = new Client();
        List<Client> clientsArray = new ArrayList<Client>();
        String[] clientData;

        for  (int i = 0; i < clientList.size(); i++){
            clientData = clientList.get(i);

                client.setClientNumber(Long.parseLong(clientData[0]));
                client.setName(clientData[1]);
                client.setRegion(clientData[2]);
                client.setBranch(clientData[3]);
                client.setPhoneNumber(Long.parseLong(clientData[4]));
                client.setEmail(clientData[5]);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {

                client.setDateOfEstablish(formatter.parse(clientData[6]));

            } catch (ParseException e) {
                e.printStackTrace();
            }
            clientsArray.add(client);

        }

    return clientsArray;

    }
}

