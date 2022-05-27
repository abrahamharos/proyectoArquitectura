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
    protected ArrayList<Concepto> listaConceptos;

    public Conceptos() {
        this.listaConceptos = new ArrayList<>();
    }
    
    public void addConcepto(Concepto concepto) {
        this.listaConceptos.add(concepto);
    }

    @Override
    public String toString() {
        return "Conceptos{" + "listaConceptos=" + listaConceptos + '}';
    }
    
    // TODO: Calcular subtotal
    public float calcularSubtotal() {
        return 0f;
    }
    
    // TODO: Calcular total
    public float calcularTotal() {
        return 0f;
    }
    
    // TODO: Calcular Impuestos Trasladados
    public float calcularImpuestosTrasladados() {
        return 0f;
    }

    public ArrayList<Concepto> getListaConceptos() {
        return listaConceptos;
    }

    public void setListaConceptos(ArrayList<Concepto> listaConceptos) {
        this.listaConceptos = listaConceptos;
    }
    
    // TODO: Calcular IVA
    public float calcularIVA() {
        return 0f;
    }
    
    // TODO: Calcular IEPS
    public float calcularIEPS() {
        return 0f;
    }
    
}
