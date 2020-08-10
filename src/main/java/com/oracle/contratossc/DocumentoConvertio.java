/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.contratossc;

/**
 *
 * @author jcpaz
 */
public class DocumentoConvertio {
 private int code;
 private String status;
 private com.oracle.contratossc.DataDoc data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataDoc getData() {
        return data;
    }

    protected void setData(DataDoc data) {
        this.data = data;
    }


 
}
