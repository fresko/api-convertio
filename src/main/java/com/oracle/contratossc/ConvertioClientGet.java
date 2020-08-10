/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jcpaz
 */
public class ConvertioClientGet {
    
     private static String BASE_URI = "https://api.convertio.co/convert/";

     /**
     * Cliente Rest GET Recuepera la URL donde se aloja el documento convertido a XLXS
     * @param iddoc
     * @return 
     */
    public DocumentoConvertio documentoXlxsUrl(String iddoc) throws InterruptedException{
        WebTarget wt;
        DocumentoConvertio docConv = new DocumentoConvertio();
        Client client = javax.ws.rs.client.ClientBuilder.newClient();
        BASE_URI = BASE_URI+iddoc+"/status";
        System.out.println("BASE_URI_XLXURL  : " + BASE_URI);
        Thread.sleep(20000); 
        wt = client.target(BASE_URI);
        Response res = wt.request(MediaType.APPLICATION_JSON).get();
        docConv = res.readEntity(DocumentoConvertio.class);
        client.close();
        System.out.println("URL Met :" +docConv.getData().getOutput().getUrl());
        return docConv;
    }
}
