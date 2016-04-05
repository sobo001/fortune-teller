/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import java.util.ArrayList;

/**
 *
 * @author sobo001
 */
public class Translator {

    private ArrayList<Ord> ordLista;
            
    public Translator (){
        ordLista = new ArrayList();
        ordLista.add(new Ord("stor","en l�nef�rh�jning","springa"));
        ordLista.add(new Ord("liten","en l�nes�kning","ljuga"));
        ordLista.add(new Ord("stark","en fotboja","flyga"));
        ordLista.add(new Ord("svag","en katt","se"));
        ordLista.add(new Ord("mjuk","en hund","vara"));
        ordLista.add(new Ord("h�rd","ett hus","�ta"));
        ordLista.add(new Ord("snabb","ett barn","m�ta"));
        ordLista.add(new Ord("svag","en katt","se"));
        ordLista.add(new Ord("vacker","ett elst�ngsel","g�"));
        ordLista.add(new Ord("ljus","en dator","r�ra"));
        ordLista.add(new Ord("m�rk","ett golv","resa"));
    }
    public String getTranslation(int calculateA, int calculateB, int calculateC, int calculateD,int calculateE) {
       return "Din framtid �r "+adjektiv(calculateA) +
               ".Du borde sluta "+ verb(calculateB)+"." + 
               " Vi ser att du snart kommer att skaffa "+substantiv(calculateC)+
               ".Snart kommer du vilja " +verb(calculateD)+", "+
               "men d� �r det viktigt att du �r "+adjektiv(calculateE)+".";
    }

    public String adjektiv(int nummer){
        if(nummer >= 0 && nummer <= 9){
            return ordLista.get(nummer).getAdjektiv();
        }
        return "";
    }
     public String verb(int nummer){
        if(nummer >= 0 && nummer <= 9){
            return ordLista.get(nummer).getVerb();
        }
        return "";
    }
      public String substantiv(int nummer){
        if(nummer >= 0 && nummer <= 9){
            return ordLista.get(nummer).getSubstantiv();
        }
        return "";
    }
    
}

