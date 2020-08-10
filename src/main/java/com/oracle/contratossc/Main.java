/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc;

import com.oracle.contratossc.entity.ConvertioClient;
import com.oracle.contratossc.entity.Options;
import com.oracle.contratossc.entity.Cpdf;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author jcpaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PDT to XLSX");
        ConvertioClient convert = new ConvertioClient();
        ConvertioClientGet convertget = new ConvertioClientGet();
        DocumentoConvertio docConv = new DocumentoConvertio();
        Cpdf pdf = new Cpdf();
        Settings st = new Settings();
        Options op= new Options();
        
        
        //pdf.setApikey("a49f93455251e3a0169c7279f4f74a1a");
        pdf.setApikey("590c715e9d33c5c3725a8af1bb8a2bc8");
        pdf.setInput("url");
        // Contrato Completos
        // pdf.setFile("https://objectstorage.us-ashburn-1.oraclecloud.com/p/HZPWoC4dZ0l2ezfTFnL3jCKB1Gdz5h9iCaSy43-OEEs/n/idi1o0a010nx/b/contratos2020/o/actodeliquidacionunilateralodemutuoacuerdoactadeliquidacion(1).pdf");
        // pdf.setFile("https://objectstorage.us-ashburn-1.oraclecloud.com/p/84e5l5csedto2mmkFUW9G7ZHiy6dtQwAVNWx5GMH_Ik/n/idi1o0a010nx/b/contratos2020/o/actodeliquidacionunilateralodemutuoacuerdoactaliquidacion(1).pdf");
        //Tablas
        pdf.setFile("https://objectstorage.us-ashburn-1.oraclecloud.com/p/1S0odLD580QsgNCWM2aIctbJ7UFRix4eggenZzdih_M/n/idi1o0a010nx/b/bucket-tablas/o/20-4-10683207_contratocontrato-5.pngcopped1101%20(1).pdf");
        //pdf.setFile("https://objectstorage.us-ashburn-1.oraclecloud.com/p/3f9are1hDPWT4Z7hWZdI1a04YSlTN1Tpo_pzjLpBIGw/n/idi1o0a010nx/b/bucket-tablas/o/20-4-10683795_adicionadicionalenvalor-1.pngcopped0.pdf");
        //pdf.setFile("https://objectstorage.us-ashburn-1.oraclecloud.com/p/vrJrbdNHLRAxUFVm1UfoULUiAbglaARoDI5i7iZB1Q4/n/idi1o0a010nx/b/bucket-tablas/o/20-4-10696867_documentoadicionalotrosimodificatorio-3.pngcopped_ap613.pdf");
        pdf.setOutputformat("XLSX");
        ///OPTIONS
        st.setLangs("spa");
        op.setOcr_enabled(true);
        op.setOcr_settings(st);
        pdf.setOptions(op);
         
        
         // cnvertir PDF to XLSX       
         String idDoc = convert.enviarPdfApi(pdf).getData().getId();
         System.out.println("PDF :" + pdf.getFile());
         docConv = convertget.documentoXlxsUrl(idDoc);
         System.out.println("PDT to XLSX :" /*+docConv.getData().getOutput().getUrl()*/);
        
             
    }
    
}
