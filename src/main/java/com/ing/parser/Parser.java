package com.ing.parser;


import com.ing.domain.Client;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 2017-03-06.
 */
@Component
public class Parser {


    public List<Client> parse(List<String[]> clientList) {

        List<Client> clientsArray = new ArrayList<Client>();
        String[] clientData;

        for (int i = 0; i < clientList.size(); i++) {
            Client client = new Client();
            clientData = clientList.get(i);

            client.setClientNumber(Long.parseLong(clientData[0]));
            client.setName(clientData[1]);
            client.setRegion(clientData[2]);
            client.setBranch(clientData[3]);
            client.setPhoneNumber(Long.parseLong(clientData[4]));
            client.setEmail(clientData[5]);
   //         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  this is for google docs csv
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

