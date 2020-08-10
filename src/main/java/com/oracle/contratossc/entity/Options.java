/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc.entity;

import com.oracle.contratossc.Settings;

/**
 *
 * @author jcpaz
 */
public class Options {
    
    boolean ocr_enabled;
    Settings ocr_settings; 

    public boolean isOcr_enabled() {
        return ocr_enabled;
    }

    public void setOcr_enabled(boolean ocr_enabled) {
        this.ocr_enabled = ocr_enabled;
    }

    public Settings getOcr_settings() {
        return ocr_settings;
    }

    public void setOcr_settings(Settings ocr_settings) {
        this.ocr_settings = ocr_settings;
    }

  
    
    
    
}
