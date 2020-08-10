/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc.entity;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jcpaz
 */
public class ConvertioClient {
    
    
    private static String BASE_URI = "https://api.convertio.co/convert";


     /**
     * Cliente Rest POST para en eviar PDF o API Convertio para su conversion
     * @param pdf
     * @return 
     */
    public ResponsePdf enviarPdfApi(Cpdf pdf) {
        WebTarget webTarget;
        Client client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
        ResponsePdf response = webTarget.request().post(Entity.entity(pdf, MediaType.APPLICATION_JSON), ResponsePdf.class);
        client.close();
        return response;
     }           
    
    
}
