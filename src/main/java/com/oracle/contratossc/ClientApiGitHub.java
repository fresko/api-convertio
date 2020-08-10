/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jcpaz
 */
public class ClientApiGitHub {
     private WebTarget webTarget;
    private Client client;
    //private static final String BASE_URI = "https://run.mocky.io/v3/3a785e5b-1ebb-4b11-9318-0cb7fb59d416";
      private static final String BASE_URI = "https://api.convertio.co/convert/7e331920ce943b67a9edb417b1349c92/status";
    
    public ClientApiGitHub() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("");
    }

     public DocumentoConvertio findApiGitHub(String q) {
      
        Response res = webTarget.request(MediaType.APPLICATION_JSON).get();
        return res.readEntity(DocumentoConvertio.class);
    }
    

    public void close() {
        client.close();
    }
}
