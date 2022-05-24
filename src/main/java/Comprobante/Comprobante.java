/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante;

import Concepto.Conceptos;

/**
 *
 * @author abrahamharos
 */
public class Comprobante implements BuilderComprobante {
    private String formaDePago;
    private String Fecha;
    private float subtotal;
    private float totalImpuestosTrasladados;
    private Conceptos conceptos;
    
    public Comprobante(){}
    
    // TODO: Calcular total comprobante
    public float calcularTotalComprobante() {
        return 0f;
    }

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
        this.Fecha = fecha;
    }

    @Override
    public void addTotalImpuestosTrasladados(float totalImpuestosTrasladados) {
        this.totalImpuestosTrasladados = totalImpuestosTrasladados;
    }
    
    @Override
    public void addConceptos(Conceptos conceptos) {
        this.conceptos = conceptos;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public String getFecha() {
        return Fecha;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public float getTotalImpuestosTrasladados() {
        return totalImpuestosTrasladados;
    }

    public Conceptos getConceptos() {
        return conceptos;
    }
}
