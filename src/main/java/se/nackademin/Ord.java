/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author sobo001
 */
public class Ord {
    
    private String adjektiv;
    private String substantiv;
    private String verb;

    public Ord( String adjektiv, String substantiv, String verb) {
        this.adjektiv = adjektiv;
        this.substantiv = substantiv;
        this.verb = verb;
    }

    public String getAdjektiv() {
        return adjektiv;
    }

    public void setAdjektiv(String adjektiv) {
        this.adjektiv = adjektiv;
    }

    public String getSubstantiv() {
        return substantiv;
    }

    public void setSubstantiv(String substantiv) {
        this.substantiv = substantiv;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    
}
