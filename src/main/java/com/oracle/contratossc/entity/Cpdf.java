/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc.entity;

/**
 *
 * @author jcpaz
 */
public class Cpdf {
    
   String apikey;
   String input;
   String file;
   String outputformat;
   Options options;

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getOutputformat() {
        return outputformat;
    }

    public void setOutputformat(String outputformat) {
        this.outputformat = outputformat;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    
  
   
   
      
}
