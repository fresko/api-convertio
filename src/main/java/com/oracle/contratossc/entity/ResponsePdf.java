/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc.entity;

import com.oracle.contratossc.entity.Data;

/**
 *
 * @author jcpaz
 */
public class ResponsePdf {
 private String code;
 private String status;
 private com.oracle.contratossc.entity.Data data;
 
 

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    protected void setData(Data data) {
        this.data = data;
    }

  
 
}
