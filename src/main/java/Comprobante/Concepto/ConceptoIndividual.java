/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Concepto;

import Comprobante.Concepto.ImpuestoTrasladado.ImpuestoTrasladado;

/**
 *
 * @author abrahamharos
 */
public class ConceptoIndividual extends Concepto {
    public ConceptoIndividual(int cantidad, float importe, float valorUnitario) {
        super(cantidad, importe, valorUnitario);
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
    
    // TODO: Calcular IVA
    public float calcularIVA() {
        return 0f;
    }
    
    // TODO: Calcular IEPS
    public float calcularIEPS() {
        return 0f;
    }
}
