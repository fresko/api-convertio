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
public class DataDoc {
 private String id;
 private String step;
 private String step_percent;
 private String minutes;
 Output output;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStep_percent() {
        return step_percent;
    }

    public void setStep_percent(String step_percent) {
        this.step_percent = step_percent;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }


 
}
