/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Concepto;

import java.util.ArrayList;

/**
 *
 * @author abrahamharos
 */
public class Conceptos {
    protected ArrayList<ConceptoIndividual> listaConceptos;

    public Conceptos() {
        this.listaConceptos = new ArrayList<>();
    }
    
    public void addConcepto(ConceptoIndividual concepto) {
        this.listaConceptos.add(concepto);
    }

    @Override
    public String toString() {
        return "Conceptos{" + "listaConceptos=" + listaConceptos + '}';
    }
    
    public float calcularSubtotal() {
        float result = 0;
        for(ConceptoIndividual concepto : this.listaConceptos) {
            result += concepto.calcularSubtotal();
        }
        
        return result;
    }
    
    public float calcularTotal() {
       return this.calcularSubtotal() + this.calcularImpuestosTrasladados();
    }
    
    public float calcularImpuestosTrasladados() {
        return this.calcularIEPS() + this.calcularIVA();
    }

    public ArrayList<ConceptoIndividual> getListaConceptos() {
        return listaConceptos;
    }

    public void setListaConceptos(ArrayList<ConceptoIndividual> listaConceptos) {
        this.listaConceptos = listaConceptos;
    }
    
    public float calcularIVA() {
        float result = 0;
        for(ConceptoIndividual concepto : this.listaConceptos) {
            result += concepto.calcularIVA();
        }
        
        return result;
    }
    
    public float calcularIEPS() {
        float result = 0;
        for(ConceptoIndividual concepto : this.listaConceptos) {
            result += concepto.calcularIEPS();
        }
        
        return result;
    }
    
}
