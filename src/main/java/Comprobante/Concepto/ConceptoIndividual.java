/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comprobante.Concepto;

import Comprobante.Concepto.ImpuestoTrasladado.ImpuestoTrasladado;
import Comprobante.Concepto.ImpuestoTrasladado.IEPS;
import Comprobante.Concepto.ImpuestoTrasladado.IVA;

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
        return this.importe;
    }
    
    // TODO: Calcular total
    public float calcularTotal() {
        return this.cantidad * this.valorUnitario + this.calcularImpuestosTrasladados();
    }
    
    // TODO: Calcular Impuestos Trasladados
    public float calcularImpuestosTrasladados() {
        return this.calcularIVA() + this.calcularIEPS();
    }
    
    public float calcularIVA() {
        float result = 0;
        
        for (ImpuestoTrasladado impuesto : this.listaImpuestos) {
            if (impuesto.getClass() == IVA.class) {
                result += impuesto.getImporte();
            }
        }
        
        return result;
    }
    
    public float calcularIEPS() {
        float result = 0;
        
        for (ImpuestoTrasladado impuesto : this.listaImpuestos) {
            if (impuesto.getClass() == IEPS.class) {
                result += impuesto.getImporte();
            }
        }
        
        return result;
    }
}
