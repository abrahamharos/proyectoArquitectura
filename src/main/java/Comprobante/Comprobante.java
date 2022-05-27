/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante;

import Comprobante.Concepto.Conceptos;
import Comprobante.Empresa.Emisor;
import Comprobante.Empresa.Receptor;

/**
 *
 * @author abrahamharos
 */
public class Comprobante implements BuilderComprobante {
    private String formaDePago;
    private String fecha;
    private float subtotal;
    private Conceptos conceptos;
    private Emisor emisor;
    private Receptor receptor;
    
    public Comprobante(){}
    
    @Override
    public void addFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public void addSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public void addFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void addConceptos(Conceptos conceptos) {
        this.conceptos = conceptos;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public String getFecha() {
        return fecha;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public Conceptos getConceptos() {
        return conceptos;
    }

    @Override
    public String toString() {
        return 
                "formaDePago: " + this.formaDePago + 
                "\nFecha: " + this.fecha +
                "\nSubtotal: " + this.subtotal;
    }

    @Override
    public void addEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    @Override
    public void addReceptor(Receptor receptor) {
        this.receptor = receptor;
    }
    
    
}
